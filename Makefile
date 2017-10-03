run:
	make -C Algorithms
	make -C Hello
	make -C HelloLogger
	make -C HelloTest
clean:
	rm -rf Algorithms/target
	rm -rf Hello/target
	rm -rf HelloLogger/target
	rm -rf HelloTest/target
