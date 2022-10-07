package lab1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class TestLab1 {

    @Test(dataProvider = "TeacherProvider")
    public void TeacherTest(Students obj1, Students obj2) {
        assertEquals(obj1, obj2);
    }
    @DataProvider
    public Object[][] TeacherProvider() {
        Teachers t1 = new Teachers.Builder()
                .setName("Olha")
                .setSurname("Ivanko")
                .setBirthday(LocalDate.of(1994, 9, 12))
                .setDateOfEmployment(LocalDate.of(2017,12,5))
                .setLanguage("Chinese").build();
        Teachers t2 = new Teachers.Builder()
                .setName("Sergiy").setSurname("Maksymenko")
                .setBirthday(LocalDate.of(1982, 4, 23))
                .setDateOfEmployment(LocalDate.of(2012,10,16))
                .setLanguage("Italian").build();
        Teachers t3 = new Teachers.Builder()
                .setName("Maryna")
                .setSurname("Svitla")
                .setBirthday(LocalDate.of(1997, 11, 20))
                .setDateOfEmployment(LocalDate.of(1920,9,2))
                .setLanguage("Polish").build();
        Teachers t4 = new Teachers.Builder()
                .setName("Maksym")
                .setSurname("Hnatyuk")
                .setBirthday(LocalDate.of(1985, 6, 19))
                .setDateOfEmployment(LocalDate.of(2010,8,10))
                .setLanguage("Japanese").build();
        Teachers t5 = new Teachers.Builder()
                .setName("Inna")
                .setSurname("Shevchenko")
                .setBirthday(LocalDate.of(1996, 8, 18))
                .setDateOfEmployment(LocalDate.of(2018,11,25))
                .setLanguage("English").build();
        return new Object[][]{{t1, t1}, {t2,t2}, {t5, t5}, {t3, t3}, {t4, t4}};
    }

    @Test(dataProvider = "TeacherProviderNotEquals")
    public void TeacherTestNotEq(Students obj1, Students obj2) {
        assertNotEquals(obj1, obj2);
    }

    @DataProvider
    public Object[][] TeacherProviderNotEquals() {
        Teachers t1 = new Teachers.Builder()
                .setName("Olha")
                .setSurname("Ivanko")
                .setBirthday(LocalDate.of(1994, 9, 12))
                .setDateOfEmployment(LocalDate.of(2017,12,5))
                .setLanguage("Chinese").build();
        Teachers t2 = new Teachers.Builder()
                .setName("Sergiy").setSurname("Maksymenko")
                .setBirthday(LocalDate.of(1982, 4, 23))
                .setDateOfEmployment(LocalDate.of(2012,10,16))
                .setLanguage("Italian").build();
        Teachers t3 = new Teachers.Builder()
                .setName("Maryna")
                .setSurname("Svitla")
                .setBirthday(LocalDate.of(1997, 11, 20))
                .setDateOfEmployment(LocalDate.of(1920,9,2))
                .setLanguage("Polish").build();
        Teachers t4 = new Teachers.Builder()
                .setName("Maksym")
                .setSurname("Hnatyuk")
                .setBirthday(LocalDate.of(1985, 6, 19))
                .setDateOfEmployment(LocalDate.of(2010,8,10))
                .setLanguage("Japanese").build();
        Teachers t5 = new Teachers.Builder()
                .setName("Inna")
                .setSurname("Shevchenko")
                .setBirthday(LocalDate.of(1996, 8, 18))
                .setDateOfEmployment(LocalDate.of(2018,11,25))
                .setLanguage("English").build();
        return new Object[][]{{t1, t3}, {t1, t2}, {t3, t4}, {t2, t4}, {t2, t5}, {t1, t5}};
    }

    @Test(dataProvider = "FLSchoolProvider")
    public void FLSchoolTest(ForeignLanguageSchool obj1, ForeignLanguageSchool obj2) {
        assertEquals(obj1, obj2);
    }

    @DataProvider
    public Object[][] FLSchoolProvider() {
        Teachers t1 = new Teachers.Builder()
                .setName("Olha")
                .setSurname("Ivanko")
                .setBirthday(LocalDate.of(1994, 9, 12))
                .setDateOfEmployment(LocalDate.of(2017,12,5))
                .setLanguage("Chinese").build();
        Teachers t2 = new Teachers.Builder()
                .setName("Sergiy").setSurname("Maksymenko")
                .setBirthday(LocalDate.of(1982, 4, 23))
                .setDateOfEmployment(LocalDate.of(2012,10,16))
                .setLanguage("Italian").build();
        Teachers t3 = new Teachers.Builder()
                .setName("Maryna")
                .setSurname("Svitla")
                .setBirthday(LocalDate.of(1997, 11, 20))
                .setDateOfEmployment(LocalDate.of(1920,9,2))
                .setLanguage("Polish").build();
        Teachers t4 = new Teachers.Builder()
                .setName("Maksym")
                .setSurname("Hnatyuk")
                .setBirthday(LocalDate.of(1985, 6, 19))
                .setDateOfEmployment(LocalDate.of(2010,8,10))
                .setLanguage("Japanese").build();
        Teachers t5 = new Teachers.Builder()
                .setName("Inna")
                .setSurname("Shevchenko")
                .setBirthday(LocalDate.of(1996, 8, 18))
                .setDateOfEmployment(LocalDate.of(2018,11,25))
                .setLanguage("English").build();
        List<Teachers> TList1 = new ArrayList<Teachers>();
        List<Teachers> TList2 = new ArrayList<Teachers>();
        TList1.add(t1);
        TList1.add(t2);
        TList1.add(t3);
        TList1.add(t4);
        TList1.add(t5);
        TList2.add(t3);
        TList2.add(t2);
        TList2.add(t1);
        TList2.add(t5);
        TList2.add(t4);
        ForeignLanguageSchool s1 = new ForeignLanguageSchool.Builder().setTeachersList(TList1).setCapacity(50).setAddress("Lesya Ukrainka str., bld. 23").build();
        ForeignLanguageSchool s2 = new ForeignLanguageSchool.Builder().setTeachersList(TList2).setCapacity(70).setAddress("Mironov str., bld. 1/А, appt. 5").build();
        return new Object[][] {{s1, s1}, {s2, s2}, {s2, new ForeignLanguageSchool.Builder().setTeachersList(TList2).setCapacity(70).setAddress("Mironov str., bld. 1/А, appt. 5").build()}};
    }
    @Test(dataProvider = "FLSchoolProviderNotEquals")
    public void FLSchoolTestNotEq(ForeignLanguageSchool obj1, ForeignLanguageSchool obj2) {
        assertNotEquals(obj1, obj2);
    }

    @DataProvider
    public Object[][] FLSchoolProviderNotEquals() {
        Teachers t1 = new Teachers.Builder()
                .setName("Olha")
                .setSurname("Ivanko")
                .setBirthday(LocalDate.of(1994, 9, 12))
                .setDateOfEmployment(LocalDate.of(2017,12,5))
                .setLanguage("Chinese").build();
        Teachers t2 = new Teachers.Builder()
                .setName("Sergiy").setSurname("Maksymenko")
                .setBirthday(LocalDate.of(1982, 4, 23))
                .setDateOfEmployment(LocalDate.of(2012,10,16))
                .setLanguage("Italian").build();
        Teachers t3 = new Teachers.Builder()
                .setName("Maryna")
                .setSurname("Svitla")
                .setBirthday(LocalDate.of(1997, 11, 20))
                .setDateOfEmployment(LocalDate.of(1920,9,2))
                .setLanguage("Polish").build();
        Teachers t4 = new Teachers.Builder()
                .setName("Maksym")
                .setSurname("Hnatyuk")
                .setBirthday(LocalDate.of(1985, 6, 19))
                .setDateOfEmployment(LocalDate.of(2010,8,10))
                .setLanguage("Japanese").build();
        Teachers t5 = new Teachers.Builder()
                .setName("Inna")
                .setSurname("Shevchenko")
                .setBirthday(LocalDate.of(1996, 8, 18))
                .setDateOfEmployment(LocalDate.of(2018,11,25))
                .setLanguage("English").build();
        List<Teachers> alt1 = new ArrayList<Teachers>();
        List<Teachers> alt2 = new ArrayList<Teachers>();
        alt1.add(t1);
        alt1.add(t2);
        alt1.add(t3);
        alt1.add(t4);
        alt1.add(t5);
        alt2.add(t3);
        alt2.add(t2);
        alt2.add(t1);
        alt2.add(t5);
        alt2.add(t4);
        ForeignLanguageSchool s1 = new ForeignLanguageSchool.Builder().setTeachersList(alt1).setCapacity(60).setAddress("Melnikova str., bld. 12").build();
        ForeignLanguageSchool s2 = new ForeignLanguageSchool.Builder().setTeachersList(alt2).setCapacity(85).setAddress("Shevchenko str., bld. 27").build();
        return new Object[][] {{s1, s2}, {s2, new ForeignLanguageSchool.Builder().setTeachersList(alt1).setCapacity(60).setAddress("Melnikova str., bld. 12").build()}
        };
    }

}
