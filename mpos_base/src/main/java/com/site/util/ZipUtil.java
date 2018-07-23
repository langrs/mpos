package com.site.util;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtil {
	private static Logger logger = Logger.getLogger(ZipUtil.class);
	/**
	 * 创建ZIP文件
	 * 
	 * @param sourcePath
	 *            文件或文件夹路径
	 * @param zipPath
	 *            生成的zip文件存在路径（包括文件名）
	 */
	public static void createZip(String sourcePath, String zipPath) {
		FileOutputStream fos = null;
		ZipOutputStream zos = null;
		try {
			fos = new FileOutputStream(zipPath);
			zos = new ZipOutputStream(fos);
			writeZip(new File(sourcePath), "", zos);
		} catch (FileNotFoundException e) {
			logger.error("创建ZIP文件失败", e);
		} finally {
			try {
				if (zos != null) {
					zos.close();
				}
			} catch (IOException e) {
				logger.error("创建ZIP文件失败", e);
			}

		}
	}

	private static void writeZip(File file, String parentPath, ZipOutputStream zos) {
		if (file.exists()) {
			if (file.isDirectory()) {// 处理文件夹
				parentPath += file.getName() + File.separator;
				File[] files = file.listFiles();
				for (File f : files) {
					writeZip(f, parentPath, zos);
				}
			} else {
				FileInputStream fis = null;
				try {
					fis = new FileInputStream(file);
					ZipEntry ze = new ZipEntry(parentPath + file.getName());
					zos.putNextEntry(ze);
					byte[] content = new byte[1024];
					int len;
					while ((len = fis.read(content)) != -1) {
						zos.write(content, 0, len);
						zos.flush();
					}

				} catch (FileNotFoundException e) {
					logger.error("创建ZIP文件失败", e);
				} catch (IOException e) {
					logger.error("创建ZIP文件失败", e);
				} finally {
					try {
						if (fis != null) {
							fis.close();
						}
					} catch (IOException e) {
						logger.error("创建ZIP文件失败", e);
					}
				}
			}
		}
	}
}
