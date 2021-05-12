package za.ac.cput.assignment2;
import java.util.Collections;

/**
 * Author: Ottor Ncedo 218052200
 * Date: 05 May 2021
 * This is a Collection programme for collection using TDD
 */



public class Colleciton {

        private String firtName;
        private String lastName;
        private String studentNumber;

        public String getFirtName() {
                return firtName;
        }

        public void setFirtName(String firtName) {
                this.firtName = firtName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getStudentNumber() {
                return studentNumber;
        }

        public void setStudentNumber(String studentNumber) {
                this.studentNumber = studentNumber;
        }

        @Override
        public String toString() {
                return "Colleciton{" +
                        "firtName='" + firtName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", studentNumber='" + studentNumber + '\'' +
                        '}';
        }
}