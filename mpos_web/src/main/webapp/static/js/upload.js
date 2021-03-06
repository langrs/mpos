$(function () {
    uploadButton = $("<input type='button' id='upload_btn'>")
      .addClass('btn btn-primary')
      .prop('disabled', true)
      .attr("value",'上传完成')
      .click('onclick', function () {
    	  var $this = $(this),
          data = $this.data();
    	  $this.off('click')
          .attr("value",'上传完成')
          .click('click', function () {
              $this.remove();
              data.abort();
              $('#upload_btn').attr("value",'上传文件').prop('disabled',false);
              $('#progress .progress-bar').css( 'width',0 + '%');
          });
    	   data.submit().always(function () {
    		   $this.remove();
           });
      });

    $('#fileupload').fileupload({
        dataType: 'json',
        autoUpload: false,
        maxFileSize: 5000000, // 5 MB
        maxNumberOfFiles: 2,  //最大条数
        disableImageResize: /Android(?!.*Chrome)|Opera/ .test(window.navigator.userAgent),
        previewMaxWidth: 200,
        previewMaxHeight: 200,
        previewCrop: true
    }).on('fileuploadadd', function (e, data) {
        data.context = $('<div/>').appendTo('#files');
        $.each(data.files, function (index, file) {
            var node = $('<p/>')
                    .append($('<span/>').text(file.name));
            if (!index) {
                node.append('<br>').append(uploadButton.clone(true).data(data));
                
            }else{
            	  node.append('<br>').append(uploadButton.clone(true).data(data));
            }
            node.appendTo(data.context);
        });
    }).on('fileuploadprocessalways', function (e, data) {
        var index = data.index,
            file = data.files[index],
            node = $(data.context.children()[index]);
        if (file.preview) {
            node
                .prepend('<br>')
                .prepend(file.preview);
        }
        if (file.error) {
            node
                .append('<br>')
                .append($('<span class="text-danger"/>').text(file.error));
        }
        if (index + 1 === data.files.length) {
            $('#upload_btn').attr("value",'上传文件')
           		 .prop('disabled', !!data.files.error);
        }
        $('#upload_btn').attr("value",'上传文件')
  		 .prop('disabled', !!data.files.error);
    }).on('fileuploadprogressall', function (e, data) {
        var progress = parseInt(data.loaded / data.total * 100, 10);
        $('#progress .progress-bar').css(
            'width',
            progress + '%'
        );
    }).on('fileuploaddone', function (e, data) {
        $.each(data.result.files, function (index, file) {
            if (file.url) {
                var link = $('<a>')
                    .attr('target', '_blank')
                    .prop('href', file.url);
                $(data.context.children()[index])
                    .wrap(link);
            } else if (file.error) {
                var error = $('<span class="text-danger"/>').text(file.error);
                $(data.context.children()[index])
                    .append('<br>')
                    .append(error);
            }
        });
    }).on('fileuploadfail', function (e, data) {
        $.each(data.files, function (index, file) {
            var error = $('<span class="text-danger"/>').text('文件上传失败.');
            $(data.context.children()[index])
                .append('<br>')
                .append(error);
            $('#progress .progress-bar').css( 'width',0 + '%');
        });
    }).prop('disabled', !$.support.fileInput)
        .parent().addClass($.support.fileInput ? undefined : 'disabled');
});
