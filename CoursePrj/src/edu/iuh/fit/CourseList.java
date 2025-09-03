/**
 * @description CourseList.java
 * @author     Lenovo
 * @version    1.0
 * @created    Sep 4, 2025 1:51:52 AM
 */

package edu.iuh.fit;

/**
 * Lớp quản lý danh sách các khóa học.
 */
public class CourseList {
    private Course[] courses;
    private int count;

    /**
     * Khởi tạo danh sách với kích thước cho trước.
     * @param size số lượng phần tử tối đa (phải lớn hơn 0)
     */
    public CourseList(int size) {
        courses = new Course[size];
        count = 0;
    }

    /**
     * Lấy số lượng khóa học hiện có trong danh sách.
     * @return số khóa học
     */
    public int getCount() {
        return count;
    }

    /**
     * Lấy toàn bộ danh sách khóa học.
     * @return mảng các khóa học
     */
    public Course[] getCourses() {
        return courses;
    }

    /**
     * Thêm một khóa học vào danh sách.
     * @param c khóa học cần thêm
     * @return true nếu thêm thành công, false nếu trùng ID hoặc danh sách đầy
     */
    public boolean addCourse(Course c) {
        if (count >= courses.length) return false;
        if (findCourse(c.getId()) != null) return false;
        courses[count++] = c;
        return true;
    }

    /**
     * Xóa khóa học theo mã.
     * @param id mã khóa học
     * @return true nếu xóa thành công, false nếu không tìm thấy
     */
    public boolean removeCourse(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equals(id)) {
                courses[i] = courses[count - 1];
                courses[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    /**
     * Tìm khóa học theo mã.
     * @param id mã khóa học
     * @return đối tượng khóa học nếu tìm thấy, ngược lại null
     */
    public Course findCourse(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equals(id)) return courses[i];
        }
        return null;
    }

    /**
     * Tìm khóa học theo tên (tương đối).
     * @param title tên khóa học cần tìm
     * @return mảng chứa các khóa học phù hợp
     */
    public Course[] searchCourseByTitle(String title) {
        int n = 0;
        Course[] result = new Course[count];
        for (int i = 0; i < count; i++) {
            if (courses[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                result[n++] = courses[i];
            }
        }
        Course[] rs = new Course[n];
        System.arraycopy(result, 0, rs, 0, n);
        return rs;
    }

    /**
     * Tìm khóa học theo khoa phụ trách.
     * @param dept tên khoa
     * @return mảng chứa các khóa học phù hợp
     */
    public Course[] searchCourseByDepartment(String dept) {
        int n = 0;
        Course[] result = new Course[count];
        for (int i = 0; i < count; i++) {
            if (courses[i].getDepartment().equalsIgnoreCase(dept)) {
                result[n++] = courses[i];
            }
        }
        Course[] rs = new Course[n];
        System.arraycopy(result, 0, rs, 0, n);
        return rs;
    }

    /**
     * Lấy khóa học có số tín chỉ cao nhất.
     * @return khóa học có tín chỉ lớn nhất hoặc null nếu danh sách rỗng
     */
    public Course getMaxCreditCourse() {
        if (count == 0) return null;
        Course max = courses[0];
        for (int i = 1; i < count; i++) {
            if (courses[i].getCredit() > max.getCredit()) max = courses[i];
        }
        return max;
    }

    /**
     * Sắp xếp danh sách khóa học theo tên.
     */
    public void sortByTitle() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (courses[i].getTitle().compareToIgnoreCase(courses[j].getTitle()) > 0) {
                    Course tmp = courses[i];
                    courses[i] = courses[j];
                    courses[j] = tmp;
                }
            }
        }
    }
}
