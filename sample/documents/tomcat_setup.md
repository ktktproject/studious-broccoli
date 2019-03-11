# tomcatの設定手順

※ディレクトリを変えた場合は読み替えること。  

###### 設定  

* tomcatに使用するJavaのパスを指定します。  
「C:\study\apache-tomcat-9.0.16\bin」に「setenv.bat」を新規作成し、下記内容を記述する。  

```
set JRE_HOME=C:\study\pleiades\java\8
```

* マネージャページのユーザ権限を設定してアクセスできるようにします。  
「C:\study\apache-tomcat-9.0.16\conf\tomcat-users.xml」をテキストエディタで開き、下記内容を追加する。  

```
  <role rolename="admin-gui"/>
  <role rolename="manager-gui"/>
  <user username="tomcat" password="tomcat" roles="admin-gui,manager-gui"/>
```

###### 起動確認  

* tomcatの起動  
「C:\study\apache-tomcat-9.0.16\bin\startup.bat」を実行する。  
※Windows7ではDOS画面が文字化けするけど気にしない。  

* Webページのアクセス確認  
[http://localhost:8080](http://localhost:8080)をWebブラウザで開く。  

* Tomcat Webアプリケーションマネージャのアクセス確認  
[Tomcat Webアプリケーションマネージャ](http://localhost:8080/manager/html)をWebブラウザで開く。  

* tomcatの停止  
Windowを閉じるか、shutdown.batを実行する。  
