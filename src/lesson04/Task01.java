package lesson04;

/**
 * В спортивном центре есть три возрастные группы для занятий волейболом:
 * 1 группа - от 7 до 13 лет;
 * 2 группа - от 14 до 17 лет;
 * 3 группа - от 18 до 65 лет.
 * Напишите метод, который принимает возраст человека и возвращает целое число,
 * которое обозначает номер группы в которую его надо определить,
 * если подходящей группы нет - верните ‘-1’.
 **/
public class Task01 {
    public static int ageGroupIdentifier(int age) {
        int groupNotFound = -1;
        int groupFromSevenToThirteen = 1;
        int groupFromFourteenToSeventeen = 2;
        int groupFromEighteenToSixtyFive = 3;

        if (age > 6 && age < 14) {
            return groupFromSevenToThirteen;
        } else if (age > 13 && age < 18) {
            return groupFromFourteenToSeventeen;
        } else if (age > 17 && age < 66) {
            return groupFromEighteenToSixtyFive;
        } else {
            return groupNotFound;
        }
    }
}
