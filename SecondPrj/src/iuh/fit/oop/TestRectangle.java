/**
 * @description TestRectangle.java
 * @author     Lenovo
 * @version    1.0
 * @created    Aug 22, 2025 1:47:38 PM
 */

package iuh.fit.oop;

import java.util.Scanner;

/**
 * Lớp kiểm thử cho {@link Rectangle}.
 */
public class TestRectangle {

    /**
     * Constructor mặc định cho lớp TestRectangle.
     */
    public TestRectangle() {
        // không làm gì cả
    }

    /**
     * Hàm main - điểm bắt đầu chương trình.
     * @param args đối số dòng lệnh
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập chiều dài: ");
            double length = sc.nextDouble();

            System.out.print("Nhập chiều rộng: ");
            double width = sc.nextDouble();

            Rectangle rect = new Rectangle(length, width);

            System.out.println("Thông tin hình chữ nhật:");
            System.out.println(rect);

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        sc.close();
    }
}
