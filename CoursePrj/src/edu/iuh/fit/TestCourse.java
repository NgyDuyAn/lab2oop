/**
 * @description TestCourse.java
 * @author     Lenovo
 * @version    1.0
 * @created    Sep 4, 2025 1:52:12 AM
 */

package edu.iuh.fit;

/**
 * Lớp kiểm thử các chức năng của Course và CourseList.
 */
public class TestCourse {

    /**
     * Constructor mặc định cho lớp TestCourse.
     * Dùng để tạo đối tượng kiểm thử.
     */
    public TestCourse() {
        // không làm gì cả
    }

    /**
     * Tạo dữ liệu mẫu cho danh sách khóa học.
     * @return đối tượng CourseList đã được thêm dữ liệu
     */
    public static CourseList initDataCourseList() {
        CourseList list = new CourseList(10);
        list.addCourse(new Course("C01", "Java Programming", 3, "IT"));
        list.addCourse(new Course("C02", "Database Systems", 4, "IT"));
        list.addCourse(new Course("C03", "Marketing Basics", 2, "Business"));
        list.addCourse(new Course("C04", "English Communication", 3, "Languages"));
        return list;
    }

    /**
     * Hàm main kiểm thử chương trình.
     * @param args đối số dòng lệnh
     */
    public static void main(String[] args) {
        CourseList list = initDataCourseList();

        System.out.println("Danh sách khóa học:");
        for (int i = 0; i < list.getCount(); i++) {
            System.out.println(list.getCourses()[i]);
        }

        System.out.println("\nKhóa học tín chỉ cao nhất: " + list.getMaxCreditCourse());

        System.out.println("\nTìm kiếm theo khoa IT:");
        for (Course c : list.searchCourseByDepartment("IT")) {
            System.out.println(c);
        }

        System.out.println("\nDanh sách sau khi sắp xếp theo tên:");
        list.sortByTitle();
        for (int i = 0; i < list.getCount(); i++) {
            System.out.println(list.getCourses()[i]);
        }
    }
}
