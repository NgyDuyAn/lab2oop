/**
 * @description Course.java
 * @author     Lenovo
 * @version    1.0
 * @created    Sep 4, 2025 1:49:58 AM
 */

package edu.iuh.fit;

/**
 * Lớp mô tả thông tin của một Khóa học.
 * Mỗi khóa học có mã, tên, số tín chỉ và khoa phụ trách.
 */
public class Course {
    private String id;
    private String title;
    private int credit;
    private String department;

    /**
     * Khởi tạo khóa học với đầy đủ thông tin.
     * @param id mã khóa học (ít nhất 3 ký tự, chỉ gồm chữ hoặc số)
     * @param title tên khóa học (không được rỗng)
     * @param credit số tín chỉ (phải lớn hơn 0)
     * @param department tên khoa phụ trách
     */
    public Course(String id, String title, int credit, String department) {
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.department = department;
    }

    /**
     * Trả về mã khóa học.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Cập nhật mã khóa học.
     * @param id mã mới (ít nhất 3 ký tự, chỉ gồm chữ hoặc số)
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Trả về tên khóa học.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Cập nhật tên khóa học.
     * @param title tên mới (không được rỗng)
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Trả về số tín chỉ của khóa học.
     * @return credit
     */
    public int getCredit() {
        return credit;
    }

    /**
     * Cập nhật số tín chỉ.
     * @param credit số tín chỉ mới (phải lớn hơn 0)
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }

    /**
     * Trả về tên khoa phụ trách khóa học.
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Cập nhật khoa phụ trách.
     * @param department tên khoa mới
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Chuỗi mô tả khóa học.
     * @return thông tin khóa học dạng chuỗi
     */
    @Override
    public String toString() {
        return String.format("Course[id=%s, title=%s, credit=%d, department=%s]",
                id, title, credit, department);
    }
}
