package task3;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/*
Создать систему для учета документов.
Создать класс Регистр, который будет иметь методы:
- сохранения документа в регистре
- предоставление информации о документе
Система может работать с тремя типами документов:
1) Контракт на поставку товаров
Содержит поля:
- Номер документа
- Тип товаров
- Количество товаров
- Дата документа
2) Контракт с сотрудником
Содержит поля:
- Номер документа
- Дата документа
- Дата документа
- Дата окончания контракта
- Имя сотрудника
3) Финансовая накладная
Содержит поля:
- Итоговая сумма за месяц
- Дата документа
- Номер документа
- Код департамента

- Класс регистр должен содержать внутри себя массив и при добавлении
документа в регистр этот добавляемый документ должен добавляться в массив;
- Массив для класса регистра должен быть размером 10;
- Для полей "Дата документа" следует использовать тип данных Date;
- В методе предоставления информации о документе следует выводить
на экран информацию о переданном входным параметром документе;
- Каждый класс для описания документов должен содержать конструктор
с параметрами и без;
- Для имитации работы системы создайте класс Main, который будет
содержать только один метод public static void main
В этом методе напишите код для создания каждого из типов документов,
добавления их в регистр и вывода информации о документе;
- Все классы разместить по пакетам;
- При выполнении задания использовать понятия интерфейсов и
абстрактных классов.
 */
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2025);
        date = c.getTime();

        ContractForEmployees employee1 = new ContractForEmployees(234, "Vaz", date);
        ContractForEmployees employee2 = new ContractForEmployees(543, "Ela", date);
        ContractForEmployees employee3 = new ContractForEmployees(2123, "Mia", date);

        ContractForGoods thing1 = new ContractForGoods(1, 5, "Коробка");
        ContractForGoods thing2 = new ContractForGoods(2, 3, "Шар");
        ContractForGoods thing3 = new ContractForGoods(3, 2, "Лошка");

        Invoice invoice1 = new Invoice(500, 4345543);
        Invoice invoice2 = new Invoice(200, 43212345);
        Invoice invoice3 = new Invoice(260, 4095832);

        Registr reg = new Registr();
        reg.saveDoc(employee1);
        reg.saveDoc(employee3);
        reg.saveDoc(employee2);
        reg.saveDoc(thing2);
        reg.saveDoc(invoice2);

        System.out.println(Arrays.toString(reg.getDocuments()));
        reg.showInfo(invoice1);
    }
}
