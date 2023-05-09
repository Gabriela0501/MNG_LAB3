object SortBabel {
    fun bubbleSort(arr: IntArray) {
        val n = arr.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    // zamiana miejscami
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
    }

    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        val array = intArrayOf(5, 2, 6, 1, 3, 9, 4)

        // Sortowanie bąbelkowe
        var temp: Int
        for (i in 0 until array.size - 1) {
            for (j in 0 until array.size - i - 1) {
                if (array[j] > array[j + 1]) {
                    temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }
        }

        // Wyświetlenie posortowanej tablicy
        print("Posortowana tablica: ")
        for (i in array.indices) {
            print(array[i].toString() + " ")
        }
    }
}