# Abstract Factory Design Pattern
## What is Abstract Factory Design Pattern
**It is a `Creational Design Pattern`**

- Abstract Factory pattern là một trong những Creational pattern. Nó là phương pháp tạo ra một Super-factory dùng để tạo ra các Factory khác. Hay còn được gọi là Factory của các Factory. Abstract Factory Pattern là một Pattern cấp cao hơn so với Factory Method Pattern.

- Trong Abstract Factory pattern, một interface có nhiệm vụ tạo ra một Factory của các object có liên quan tới nhau mà không cần phải chỉ ra trực tiếp các class của object. Mỗi Factory được tạo ra có thể tạo ra các object bằng phương pháp giống như Factory pattern.

- Hãy tưởng tượng, Abstract factory như là một nhà máy lớn chứa nhiều nhà máy nhỏ, trong các nhà máy đó có những xưởng sản xuất, các xưởng đó tạo ra những sản phẩm khác nhau.

## Structure of Abstract Factory Design Pattern**

`Super Factory`: Để Client khai báo super class.

`Abstract Factory` : Khai báo dạng interface hoặc abstract class chứa các phương thức để tạo ra các đối tượng abstract.

`Concrete Factory` : Xây dựng, cài đặt các phương thức tạo các đối tượng cụ thể.

`Abstract Product` : Khai báo dạng interface hoặc abstract class để định nghĩa đối tượng abstract.

`Product` : Cài đặt của các đối tượng cụ thể, cài đặt các phương thức được quy định tại AbstractProduct.

`Client` : là đối tượng sử dụng AbstractFactory và các AbstractProduct.

## Benefit
- Các lợi ích của Factory Pattern cũng tương tự như Factory Method Pattern như: cung cấp hướng tiếp cận với Interface thay thì các implement, che giấu sự phức tạp của việc khởi tạo các đối tượng với người dùng (client), độc lập giữa việc khởi tạo đối tượng và hệ thống sử dụng, …

- Giúp tránh được việc sử dụng điều kiện logic bên trong Factory Pattern. Khi một Factory Method lớn (có quá nhiều sử lý if-else hay switch-case), chúng ta nên sử dụng theo mô hình Abstract Factory để dễ quản lý hơn (cách phân chia có thể là gom nhóm các sub-class cùng loại vào một Factory).

- Abstract Factory Pattern là factory của các factory, có thể dễ dạng mở rộng để chứa thêm các factory và các sub-class khác.
Dễ dàng xây dựng một hệ thống đóng gói (encapsulate): sử dụng được với nhiều nhóm đối tượng (factory) và tạo nhiều product khác nhau.