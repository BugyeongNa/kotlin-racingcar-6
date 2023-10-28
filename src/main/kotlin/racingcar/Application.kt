package racingcar

import camp.nextstep.edu.missionutils.Console
import camp.nextstep.edu.missionutils.Randoms


fun main() {

    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    val names = Console.readLine().split(",").map {
        if (it.length > 5) {
            throw IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.")
        }
        it
    }

    println("시도할 횟수는 몇 회인가요?")
    val attempts = Console.readLine().toInt()

    val cars = names.map { Car(it) }
}

class Car(name: String) {

    val name = name

}
