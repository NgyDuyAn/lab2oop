/**
 * @description Rectangle.java
 * @author     Lenovo
 * @version    1.0
 * @created    Aug 22, 2025 1:47:19 PM
 */

package iuh.fit.oop;

/**
 * Lớp mô tả hình chữ nhật với chiều dài và chiều rộng.
 * Cung cấp các phương thức tính diện tích, chu vi và xuất thông tin.
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Khởi tạo một hình chữ nhật.
     * 
     * @param length chiều dài (phải &gt; 0)
     * @param width chiều rộng (phải &gt; 0)
     * @throws IllegalArgumentException nếu length hoặc width &lt;= 0
     */
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Lấy chiều dài của hình chữ nhật.
     * 
     * @return chiều dài
     */
    public double getLength() {
        return length;
    }

    /**
     * Lấy chiều rộng của hình chữ nhật.
     * 
     * @return chiều rộng
     */
    public double getWidth() {
        return width;
    }

    /**
     * Gán giá trị mới cho chiều dài.
     * 
     * @param newVal giá trị chiều dài mới (phải &gt; 0)
     * @throws IllegalArgumentException nếu newVal &lt;= 0
     */
    public void setLength(double newVal) {
        if (newVal <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = newVal;
    }

    /**
     * Gán giá trị mới cho chiều rộng.
     * 
     * @param newVal giá trị chiều rộng mới (phải &gt; 0)
     * @throws IllegalArgumentException nếu newVal &lt;= 0
     */
    public void setWidth(double newVal) {
        if (newVal <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = newVal;
    }

    /**
     * Tính diện tích hình chữ nhật.
     * 
     * @return diện tích
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Tính chu vi hình chữ nhật.
     * 
     * @return chu vi
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Biểu diễn hình chữ nhật dưới dạng chuỗi.
     * 
     * @return chuỗi chứa chiều dài, chiều rộng, diện tích và chu vi
     */
    @Override
    public String toString() {
        return String.format("Rectangle[length=%.2f, width=%.2f, area=%.2f, perimeter=%.2f]",
                length, width, getArea(), getPerimeter());
    }
}
