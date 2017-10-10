#!/usr/bin/env bash
jlink --module-path Algorithms/target/classes:Hello/target/classes:$JAVA_HOME/jmods --add-modules Algorithms,Hello --launcher start=Hello/com.example.app.Hello --output Hello-image
printf "\nEscribe Hello-image/bin/start para arrancar\n\n"
