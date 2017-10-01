run: ../Hello/out
	javac --module-path lib:../Hello/out `find src/HelloTest -name "*.java"` -d out/HelloTest
	java --module-path lib:../Hello/out:out/HelloTest --add-modules Hello,HelloTest -m junit/org.junit.runner.JUnitCore com.example.junit.HelloTest
../Hello/out:
	make -C ../Hello run