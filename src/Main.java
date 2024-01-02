
public class Main {
	public static void main (String[] args) {
		/*
		 * Uses values to test the methods on unsorted arrays. The given times may vary based on the test data sets.
		 * To fully see how these algorithms run, multiple trials should be done with data sets varying in size and order.
		 * Small has 100 values. Medium has 300 values. Large has a 1000 values.
		 */
		int[] small = {199, 14, 168, 573, 508, 588, 683, 817, 687, 1, 338, 568, 312, 776, 264, 768, 969, 407, 879, 335, 134, 151, 960, 520, 734, 495, 223, 119, 91, 390, 130, 427, 20, 435, 249, 909, 987, 662, 600, 401, 870, 228, 916, 937, 679, 494, 287, 907, 612, 666, 849, 34, 578, 900, 366, 592, 585, 115, 350, 490, 739, 572, 501, 185, 781, 429, 845, 807, 563, 963, 218, 720, 444, 387, 958, 553, 758, 657, 111, 745, 498, 582, 434, 670, 577, 465, 813, 497, 242, 413, 789, 967, 164, 628, 961, 454, 421, 590, 744, 929};
		int[] medium = {552, 577, 390, 178, 861, 993, 593, 179, 132, 220, 569, 439, 39, 81, 123, 339, 5, 547, 597, 286, 921, 728, 908, 916, 799, 17, 478, 509, 986, 735, 633, 815, 936, 2, 11, 155, 590, 162, 53, 383, 703, 385, 862, 943, 30, 562, 435, 485, 482, 131, 909, 346, 766, 43, 606, 54, 656, 145, 709, 337, 975, 721, 746, 169, 660, 727, 441, 901, 144, 826, 812, 148, 798, 929, 267, 873, 364, 20, 781, 83, 134, 270, 281, 818, 882, 688, 240, 523, 894, 241, 963, 934, 502, 987, 918, 206, 857, 710, 913, 755, 745, 319, 650, 322, 840, 467, 674, 834, 575, 772, 243, 234, 256, 224, 143, 309, 514, 87, 533, 783, 100, 822, 515, 787, 567, 389, 638, 278, 803, 732, 242, 171, 408, 789, 747, 610, 991, 811, 634, 406, 506, 275, 554, 954, 212, 512, 553, 260, 613, 86, 559, 44, 250, 176, 109, 706, 412, 248, 796, 655, 625, 342, 392, 875, 367, 396, 151, 216, 505, 890, 181, 437, 542, 905, 982, 454, 690, 414, 129, 579, 612, 347, 629, 960, 598, 632, 493, 471, 865, 989, 300, 1, 125, 521, 806, 779, 207, 177, 920, 115, 757, 120, 947, 513, 468, 948, 829, 867, 137, 263, 645, 874, 489, 911, 230, 245, 351, 401, 589, 417, 391, 508, 191, 821, 817, 464, 293, 27, 753, 10, 32, 752, 551, 373, 413, 968, 677, 165, 876, 306, 280, 57, 271, 685, 388, 318, 184, 651, 18, 896, 35, 764, 534, 539, 254, 917, 380, 999, 517, 540, 819, 592, 510, 536, 187, 288, 718, 315, 492, 983, 717, 739, 21, 925, 944, 603, 68, 658, 19, 456, 421, 363, 424, 217, 71, 966, 331, 138, 66, 387, 754, 881, 702, 697, 257, 140, 321, 247, 720, 14};
		int[] large = {14, 380, 223, 211, 880, 290, 569, 904, 489, 232, 77, 188, 177, 814, 237, 167, 130, 929, 405, 950, 101, 860, 941, 535, 228, 735, 123, 267, 629, 858, 441, 722, 503, 553, 787, 517, 490, 998, 469, 338, 640, 945, 386, 442, 597, 412, 137, 595, 170, 641, 336, 23, 562, 160, 349, 647, 541, 365, 983, 404, 842, 474, 162, 798, 334, 716, 884, 928, 85, 294, 949, 876, 979, 403, 467, 643, 289, 969, 217, 757, 593, 328, 153, 725, 199, 70, 551, 313, 774, 839, 807, 773, 4, 826, 671, 594, 72, 83, 577, 926, 679, 317, 118, 143, 401, 80, 125, 986, 66, 591, 520, 315, 385, 811, 89, 906, 710, 871, 73, 752, 681, 831, 960, 92, 576, 450, 304, 718, 39, 623, 942, 845, 882, 996, 370, 381, 756, 366, 733, 542, 282, 103, 413, 437, 550, 166, 105, 676, 804, 590, 727, 843, 26, 753, 354, 24, 610, 521, 31, 893, 850, 707, 214, 505, 152, 865, 21, 276, 953, 658, 456, 220, 117, 631, 869, 238, 79, 691, 324, 136, 251, 770, 930, 823, 494, 742, 102, 948, 498, 546, 348, 234, 69, 288, 416, 350, 479, 64, 760, 572, 995, 340, 664, 793, 458, 264, 249, 485, 122, 344, 387, 768, 425, 446, 531, 993, 690, 886, 407, 766, 168, 813, 992, 650, 834, 731, 519, 523, 255, 543, 616, 181, 796, 732, 662, 967, 81, 16, 628, 163, 107, 368, 802, 688, 900, 99, 601, 230, 697, 985, 444, 419, 402, 877, 486, 443, 669, 740, 347, 18, 396, 962, 13, 483, 111, 951, 749, 935, 41, 244, 478, 124, 363, 825, 428, 504, 938, 682, 6, 990, 373, 306, 790, 971, 3, 683, 427, 715, 414, 499, 488, 293, 477, 287, 600, 721, 275, 657, 189, 473, 989, 393, 236, 53, 633, 524, 663, 151, 218, 815, 192, 433, 711, 229, 891, 291, 604, 885, 330, 452, 794, 795, 963, 564, 695, 765, 432, 829, 277, 185, 47, 86, 609, 918, 126, 763, 627, 1000, 668, 42, 605, 903, 43, 701, 156, 512, 430, 93, 565, 637, 694, 849, 830, 581, 940, 868, 95, 337, 269, 314, 667, 758, 140, 271, 615, 481, 545, 937, 835, 216, 321, 226, 984, 155, 37, 121, 341, 250, 883, 612, 154, 240, 406, 513, 705, 339, 424, 964, 709, 838, 954, 675, 645, 654, 944, 723, 208, 115, 836, 28, 800, 739, 557, 777, 195, 507, 911, 187, 44, 873, 196, 257, 862, 781, 771, 308, 780, 755, 210, 449, 212, 833, 840, 648, 717, 132, 491, 480, 395, 659, 544, 45, 700, 157, 285, 821, 38, 889, 374, 622, 262, 235, 190, 897, 837, 331, 738, 335, 915, 178, 100, 632, 203, 270, 917, 9, 540, 33, 470, 198, 720, 539, 902, 846, 448, 87, 32, 492, 383, 497, 589, 696, 699, 382, 343, 982, 832, 453, 466, 179, 409, 653, 128, 592, 465, 284, 684, 515, 898, 764, 200, 596, 548, 65, 76, 874, 356, 943, 585, 810, 60, 549, 358, 870, 919, 822, 772, 323, 445, 75, 642, 50, 866, 67, 706, 142, 673, 29, 797, 713, 159, 71, 887, 388, 280, 417, 867, 560, 84, 113, 973, 186, 892, 68, 258, 933, 522, 946, 910, 369, 799, 182, 204, 463, 924, 652, 96, 30, 90, 974, 896, 820, 325, 775, 587, 421, 661, 816, 326, 455, 120, 855, 256, 439, 55, 761, 371, 109, 863, 745, 824, 847, 57, 991, 372, 801, 183, 191, 434, 1, 138, 34, 247, 297, 724, 248, 301, 173, 2, 776, 818, 501, 15, 205, 702, 129, 936, 265, 584, 536, 530, 98, 435, 939, 879, 62, 568, 131, 881, 532, 260, 332, 909, 744, 558, 981, 635, 399, 222, 231, 362, 392, 931, 259, 245, 415, 748, 459, 656, 148, 169, 908, 278, 149, 809, 687, 588, 571, 116, 923, 819, 514, 161, 789, 144, 58, 175, 213, 712, 318, 418, 618, 566, 48, 281, 854, 254, 397, 353, 52, 184, 224, 762, 965, 454, 411, 685, 708, 759, 355, 894, 817, 311, 252, 599, 769, 376, 672, 955, 209, 970, 147, 606, 106, 56, 750, 88, 475, 554, 94, 319, 207, 693, 201, 561, 12, 957, 378, 968, 689, 394, 746, 677, 961, 582, 559, 828, 74, 976, 621, 462, 194, 726, 792, 537, 279, 888, 853, 778, 901, 158, 533, 11, 803, 10, 423, 912, 361, 644, 367, 692, 20, 461, 624, 617, 298, 241, 351, 49, 63, 246, 302, 19, 7, 786, 46, 91, 856, 630, 646, 827, 574, 176, 638, 242, 578, 704, 508, 602, 686, 977, 145, 666, 660, 303, 614, 516, 36, 547, 580, 743, 426, 947, 852, 920, 227, 27, 808, 261, 988, 312, 104, 438, 345, 206, 626, 997, 925, 665, 422, 487, 391, 59, 914, 857, 299, 389, 436, 322, 506, 54, 307, 737, 471, 468, 844, 729, 511, 651, 806, 714, 767, 243, 573, 225, 534, 805, 359, 408, 239, 864, 674, 476, 921, 61, 987, 907, 978, 451, 598, 736, 956, 890, 114, 509, 333, 310, 526, 283, 502, 193, 859, 17, 296, 555, 608, 872, 779, 171, 25, 108, 22, 579, 357, 320, 51, 180, 400, 447, 5, 556, 398, 841, 784, 82, 35, 292, 788, 563, 500, 495, 273, 460, 493, 639, 975, 384, 316, 570, 119, 980, 751, 274, 286, 420, 197, 747, 603, 812, 346, 741, 932, 966, 219, 636, 110, 528, 253, 390, 927, 309, 529, 8, 457, 78, 305, 649, 364, 861, 575, 360, 607, 791, 327, 510, 613, 875, 754, 377, 905, 655, 567, 300, 972, 994, 268, 440, 611, 329, 620, 895, 429, 133, 431, 734, 464, 150, 783, 934, 172, 552, 619, 670, 913, 146, 112, 848, 165, 375, 263, 719, 625, 538, 134, 97, 728, 221, 342, 484, 527, 703, 215, 525, 233, 782, 959, 139, 678, 634, 698, 141, 851, 899, 472, 40, 730, 379, 518, 922, 999, 586, 952, 272, 295, 785, 127, 164, 878, 482, 266, 410, 958, 135, 202, 174, 916, 680, 496, 583, 352};
		Algorithms algie = new Algorithms();
		
		System.out.println("Small Set:");
		
		long startTime = System.nanoTime();
		int[] test = algie.bubbleSort(small);
		long endTime = System.nanoTime();
		String out = "";					//Will hold the sorted values in the array. These values are retrieved from the for loop below.
		out = outString(test, out);
		System.out.println("Bubble Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.mergeSort(small, 0, (small.length - 1));
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Merge Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.insertionSort(small);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Insertion Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.heapSort(small, small.length);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Heap Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.randomQuickSort(small, 0, (small.length - 1));
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Random Quick Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.radixSort(small, 3);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Radix Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		System.out.println();
		System.out.println("Medium Set:");
		
		
		startTime = System.nanoTime();
		test = algie.bubbleSort(medium);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Bubble Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.mergeSort(medium, 0, (medium.length - 1));
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Merge Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.insertionSort(medium);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Insertion Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.heapSort(medium, medium.length);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Heap Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.randomQuickSort(medium, 0, (medium.length - 1));
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Random Quick Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.radixSort(medium, 3);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Radix Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		
		System.out.println();
		System.out.println("Large Set:");
		
		startTime = System.nanoTime();
		test = algie.bubbleSort(large);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Bubble Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.mergeSort(large, 0, (large.length - 1));
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Merge Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.insertionSort(large);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Insertion Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.heapSort(large, large.length);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Heap Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.randomQuickSort(large, 0, (large.length - 1));
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Random Quick Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
		
		startTime = System.nanoTime();
		test = algie.radixSort(large, 4);
		endTime = System.nanoTime();
		out = "";
		out = outString(test, out);
		System.out.println("Radix Sort:");
		System.out.println(out);
		System.out.println("Time: " + (endTime - startTime) + " nano seconds");
	}

	private static String outString(int[] test, String out) {
		for(int i = 0; i < test.length; i++) {
			out += test[i] + ", ";
		}
		return out;
	}

}
