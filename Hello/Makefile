run: ../Algorithms/target/classes/Algorithms
	javac `find src/Hello -name "*.java"` --module-path ../Algorithms/target/classes --add-modules Algorithms -d target/classes/Hello
	java --module-path target/classes:../Algorithms/target/classes --add-modules Hello,Algorithms com.example.app.Hello
test:
	make -C ../HelloTest run
../Algorithms/target/classes/Algorithms:
	make -C ../Algorithms run