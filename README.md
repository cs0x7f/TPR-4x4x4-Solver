TPR-4x4x4-Solver
================

4x4x4 Solver = Three-Phase-Reduction Solver + 3x3x3 Solver

# Useage:
    sh make.sh -> threephase.jar
    java -jar threephase.jar N -> solving N random cube with 40 random moves' scramble.

# Test (java -jar threephase.jar 100 / 2.2GHz):
    Average solution length: 44.60 moves(ftm).
    Average solving time: 280 ms.
    Memory: 80M with generated table.

# Note:
	At its first executing, about 50M's tables will be generated and written to disk. The generation spends several minutes, and it will speed up with multiple processors.

# Algorithm:
	[Tsai's 8-step 4x4x4 algorithm](http://cubezzz.dyndns.org/drupal/?q=node/view/73#comment-2588)
	The solver merges Tsai's step3 and step4 into one step and use [min2phase package](https://github.com/ChenShuang/min2phase) to replace Tsai's step5-8

# TODO:
	Speeding up initialization.
	Solution format.