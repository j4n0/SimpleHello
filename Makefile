run:
	make -C Algorithms
	make -C Hello
	make -C HelloTest
clean:
	rm -rf Algorithms/target
	rm -rf Hello/target
	rm -rf HelloTest/target
