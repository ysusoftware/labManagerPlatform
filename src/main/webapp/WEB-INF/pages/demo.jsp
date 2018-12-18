<%--
  Created by IntelliJ IDEA.
  User: 12697
  Date: 2018/12/17
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="../../js/vue.min.js"></script>
<script charset="utf-8" src="../../kindeditor/kindeditor.js"></script>
<script charset="utf-8" src="../../kindeditor/lang/zh_CN.js"></script>
<textarea id="editorBody" name="content" style="width:700px;height:300px;">
                             <!--&lt;strong&gt;HTML内容&lt;/strong&gt;-->
                             </textarea>
<a href="demo.html">
<script>
    KindEditor.ready(function (K) {
        var editor = K.create('#editorBody', {
            uploadJson: "http://localhost:8080/introController/IntroBodyPicUpload.do?sendUrl="+window.location.href,
            allowFileManager: true,
            filePostName: 'file',//跟服务端参数对应
            afterUpload: function () {
                this.sync();
            }, //图片上传后，将上传内容同步到textarea中
            afterBlur: function () {
                this.sync();
            },   ////失去焦点时，将上传内容同步到textarea中
        });
    });
</script>
</body>
</html>
