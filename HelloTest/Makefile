run: ../Hello/target/classes ../HelloLogger/target/classes
	javac --module-path lib:../Hello/target/classes:../HelloLogger/target/classes `find src/HelloTest -name "*.java"` -d target/classes/HelloTest
	 java --module-path lib:../Algorithms/target/classes:../Hello/target/classes:target/classes:../HelloLogger/target/classes:target/classes --add-modules Algorithms,Hello,HelloLogger,HelloTest -m junit/org.junit.runner.JUnitCore com.example.junit.HelloTest
../Hello/target/classes:
	make -C ../Hello
../HelloLogger/target/classes:
	make -C ../HelloLogger
