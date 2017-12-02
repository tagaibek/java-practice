### New

- http://acmp.ru/index.asp?main=task&id_task=28 - symmetrical ?
- https://www.hackerrank.com/challenges/java-datatypes/problem - datatypes ?
- http://acmp.ru/index.asp?main=task&id_task=542 - bit-reverse ?
- https://www.hackerrank.com/challenges/queue-using-two-stacks/problem - queue ?

+ http://acmp.ru/index.asp?main=task&id_task=95 - numerologist!!!
+ http://acmp.ru/index.asp?main=task&id_task=85 - gcd1!!!

### Reviewed
* https://www.hackerrank.com/challenges/array-left-rotation/problem - left-rotation
* http://acmp.ru/index.asp?main=task&id_task=271 - fibonacci2
* http://acmp.ru/index.asp?main=task&id_task=642 - business
* http://acmp.ru/index.asp?main=task&id_task=44 - arrow 
* http://acmp.ru/index.asp?main=task&id_task=62 - chess
* http://acmp.ru/index.asp?main=task&id_task=691 - bus numbers
* http://acmp.ru/index.asp?main=task&id_task=294 - nuts
* http://acmp.ru/index.asp?main=task&id_task=26  - circle
* http://acmp.ru/index.asp?main=task&id_task=678 - shuler
* https://projecteuler.net/problem=9 - pythagorean
* https://projecteuler.net/problem=1 - multiples of 3 & 5
* http://acmp.ru/- gcd ( greatest common divisor )
* http://acmp.ru/index.asp?main=task&id_task=317 - santa 
* http://acmp.ru/index.asp?main=task&id_task=131 - oldest man
* http://acmp.ru/index.asp?main=task&id_task=633 - ACM world

### Core Java
1. Class
2. Constructor - matches with name of the class | совпадает названием класса.
    1. constructors can only be called when creating objects. | Контсрукторы вызываютс только тогда, когда новые обьекты создаются
    2. objects can only be created with keyword "new" | обьекты создаются только с помощью ключегого слова "new"
    3. "new"  the only function of this word is to create objects | "new" - единственная функция этого слова, создавать обьекты.
    4. constructors do not return anything | конструкторы ничего не возвращают.
3. Object
4. Method - методы либо возвращают значения или не возвращают. название метода всегда нач-я с маленкой буквой
    1. если метод не возвращяет, то отмечается с ключевым словом "void"
    2. если метод возвращяет, то указывается тип возвращяемого обьекта (или примитивного типа)
    3. non-static (object level) - these methods can only be called using objects | эти методы можно вызвать только с помощью обьектов
    4. static (class level) - can be called without (and with) objects | можно вызвать не создавая обьекты, через класс
    5. методы могут  принимать параметры
5. Property  | свойства - обьекта или класса
    1. non-static (object level) - свойства обьекта
    2. static - свойсвта класса
6. Parameter - methods and constructors can accept parameters | методы и конструкторы могут принимать праметры.

### EXTRAs
1) Array / Массивы  - отмечаются типом и квадратными скобками : int[] intArray, String[] strs, Dog[] dogs
2) List / Список - отмечаются с классом *List и содержимым типом: List<String> stringList, ArrayList<Integer> intLists

### OOP - object oriented programming

 Interface:
 1) Внутри интерфейса обьявляются только методы без раелазации
 2) методы интерфейса по умолчанию публичные
 3) интерфейсы нельзя инициализировать.
 4) интерфейсы могут унаследовать другие интерфейсы - ключевое слово "extends"

 Abstract Class
 1) методы могут быть не реализованные - в этом случае используется ключевое слово "abstract"
 2) методы можно реализовать как и все обычные методы
 3) абстрактные классы нельзя инициализировать

 Class
 1) все методые реализированные
 2) класс может наследовать только ОДИН класс - и для этого используется ключевое слово "extends"
 3) наследуемый класс может быть абстрактным.
 3) класс может наследовать (или реализовать) несколько интерфейсов. - и для этого используется ключевое слово "implements"

 Наследование
 Constructor - если у родительского класса есть конструкоры,
  все наследуищие классы должны вызывать один из конструкоров родительсково класса на первой линии конструктора. Для этого
  используется ключевое слово super(параметры).
  
 1. `Переопределение / Override` -  точная копия определение и возвращаемого типа метода 
 родительского класса.
    1. возврощает такого же типа обьект что и родительский метод
    2. название метода должна совподать
    3. принимает параметры такого же типа и количество что и родительский метод
    4. переопределение используется только при наследовании
    5. Дети могут переопределить методы родителей.
    
 ```java
 class Car{
    private String model;
    
    String getModel(){
        return this.model;
    }
    
    void setModel(String model){
        this.model = model;
    }
 }
 
 class TikoCar extends Car{
    private String tikoModel;
    
    @Override
    String getModel(){
        return this.tikoModel;
    }
    
    @Override
    void setModel(String tikoM1){
        this.tikoModel = tikoM1;
    }
     
}
 ```
2. `Перезагрузка / overloading` - при перезагрузке метода, наслодование условное.
Можно перезагрузить методы своего же класса.
    1. совподает возвращаемый тип.
    2. совподает название метода.
    3. НЕ совподают количество и типы параметров.

```java
class TikoCar {
    private String model;
    
    void setModel(String model){
        this.model = model;
    }
        
    void setModel(String mod1, int year){
        this.model = mod1;
    }
    
    void setModel(String name, int year, String color ){
        this.model = name + " year=" + year + ", color = "+color;
    }
        
    String getModel(){
        return this.model;
    }
 }

class Boot{
    main(String[] args){
        //part 1 - cannot be changed - нельзя менять.
        TikoCar car = new TickoCar();
        car.setModel("tiko 2015");
        System.out.println(car.getModel());
    }
    //output = tiko 2015
    
    main2(){
          //part 2
        String name = "Tiko";
        int year = 2015;
      
        TikoCar car = new TikoCar();
        car.setModel(name, year);
        System.out.println(car.getModel());
      // output = tiko year=2015
    }
    
    main3(){
        String name ="Tico";
        int year = 2012;
        String color= "red";
        
        
        TikoCar car = new TikoCar();
        car.setModel(name,year,color);
    }
    // output Tico year=2012, color=red
}
```

### Tips - шпаргалки
 instanceof - условное ключевое слово, проверяет тип обьекта.
 
```java
 /*!true = false
 !false = true
 !isArtificial = (isArtificial == false)
```

```java
  /*int b = 0;
  String result;
  if( b < 5) {
    restult = "Yes"
  } else {
    result = "No"
  }
```

```java
  /*int b = 0;
  String result = ( b < 5 ) ? "Yes": "No";
```
  
### Exceptions | Errors - Ошибки
  * `NullpointerException` = когда значение переменного `null`, но программа пытается вызвать свойства или методы 
  у этого обьекта
  * `ArrayOutOfBoundsException` = когда программа вызывает значение в массиве по индексу который не существует.
