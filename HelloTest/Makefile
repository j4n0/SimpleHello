run: ../Hello/out
	javac --module-path lib:../Hello/target/classes `find src/HelloTest -name "*.java"` -d target/classes/HelloTest
	 java --module-path lib:../Algorithms/target/classes:../Hello/target/classes:target/classes --add-modules Algorithms,Hello,HelloTest -m junit/org.junit.runner.JUnitCore com.example.junit.HelloTest
../Hello/out:
	make -C ../Hello run
