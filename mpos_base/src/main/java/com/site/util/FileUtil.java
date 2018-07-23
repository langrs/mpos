package com.site.util;

import java.io.*;

/**
 * 
 * @author huj1
 * 
 */
public class FileUtil {
	/**
	 * 传入的格式为：D:/newpos/log/misInRK.txt
	 * 
	 * @param fileName
	 * @param content
	 */
	public static void writer(String fileName, String content) {
		Writer writer = null;
		int lastIndexOf = fileName.lastIndexOf("\\");
		String dir = fileName.substring(0, lastIndexOf);
		File file = new File(dir);
		if (!file.exists()) {
			file.mkdirs();
		}
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));
			writer.write(content);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			try {
				writer.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	/**
	 * 删除某个文件夹下的所有文件夹和文件
	 * 
	 * @param delpath
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */

	public static boolean deletefile(String delpath) {
		try {
			File file = new File(delpath);
			if (!file.isDirectory()) {
				file.delete();
			} else if (file.isDirectory()) {
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File delfile = new File(delpath + "\\" + filelist[i]);
					if (!delfile.isDirectory()) {
						delfile.delete();
					} else if (delfile.isDirectory()) {
						deletefile(delpath + "\\" + filelist[i]);
					}
				}
				file.delete();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
