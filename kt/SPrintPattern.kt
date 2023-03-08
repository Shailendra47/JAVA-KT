 fun main() {
        for (rows in 1..9) {
            for (cols in 1..10) {
                if (rows == 1 || rows == 10 / 2 || rows == 9) {
                    print("*")
                } else if (rows < 10 / 2 && cols == 1) {
                    print("*")
                } else if (rows > 9 / 2 && cols == 10) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
 }