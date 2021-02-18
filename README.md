# java

#Docker 起動
<br>
// dockerビルド
% docker-compose build

// dockerをバックグラウンドで起動
% docker-compose up -d

//確認
%docker-compose ps

＃コンパイルと実行
<br>
// インスペクション
% docker-compose exec java bash

// コンパイル
root@5b7be900c329:/usr/src# javac Main.java

// 実行
root@5b7be900c329:/usr/src# java Main
Hello World!

＃git 備忘録
<br>
// cdコマンドを使って、該当のディレクトリまで移動
// 今回はworkspace/hogeを例に
$ cd workspace/hoge

// gitを初期化
$ git init

// ステージングにあげる
$ git add .

// 最初のコミットメッセージを書く
$ git commit -m "first commit"

// リモートにアクセス
$ git remote add origin ここにgithubで作ったリポジトリのURL
// 例
$ git remote add origin https://github.com/hoge/hoge.git

//masterへpush
$ git push origin master
