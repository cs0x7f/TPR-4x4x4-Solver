TPR-4x4x4-Solver
================

4x4x4 Solver = Three-Phase-Reduction Solver + 3x3x3 Solver

# Usage:
 - sh make.sh -> threephase.jar
 - java -jar threephase.jar N -> solving N random cube with random-state scramble.

# Test ("java -jar threephase.jar 2000" @Intel core i7 2670QM):
 - Average solution length: 44.46 moves(face turn metric).
 - Average solving time: 300 ms.
 - Memory: 30M with min2phase package.
 - Initialization time: 10s
 - Length Distribution (2000 random-state solves, average 44.626 moves):
 40  5
 41  28
 42  93
 43  265
 44  564
 45  652
 46  352
 47  41


# Note:
 - At its first executing, about 20M's tables will be generated and written to disk (md5(Center1.move) = 2b31ffa7ee59cc2313d2fa9b41106a03, md5(Edge3.prunS) = 5fab4b768165375124eaf83e1a884c89). 

# Algorithm:
 - [Tsai's 8-step 4x4x4 algorithm](http://cubezzz.dyndns.org/drupal/?q=node/view/73#comment-2588)
 - The solver merges Tsai's step3 and step4 into one step and use [min2phase package](https://github.com/ChenShuang/min2phase) to replace Tsai's step5-8

# TODO:
 - Speeding up initialization.
 - Solution format.
 - Many bugs which might cause ArrayIndexOutOfBoundsException.

# License GPLv3

    Copyright (C) 2012  Shuang Chen

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
