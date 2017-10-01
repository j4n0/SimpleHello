run:
	javac `find src/Hello -name "*.java"` -d out/Hello
	java --module-path out/Hello --add-modules Hello com.example.app.Hello
test:
	make -C ../HelloTest run
