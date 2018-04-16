package web.element;

import element.Element;
import org.openqa.selenium.By;

public class Application {
    public static String URL="http://testing.cld.iba.by/web/guest/recruiting/applications";
    public static Element CREAT_APPLICATION = new Element("Создание заявки", By.xpath("//*[@id=\"createButton\"]"));
    public static Element POSITION = new Element("Должность",By.xpath("//*[@id=\"name\"]"));
    public static Element CLOSING_DATE = new Element("Дата закрытия",By.xpath("//*[@id=\"plannedClosingDate\"]"));
    public static Element PRIORITY_LOW = new Element("Приоритет-низкий",By.xpath("//div//label[text() = 'низкий']"));
    public static Element PRIORITY_MIDDLE = new Element ("Приоритет-средний",By.xpath("//div//label[text() = 'средний']"));
    public static Element PRIORITY_HIGH = new Element ("Приоритет-Высокий",By.xpath("//div//label[text() = 'высокий']"));
    public static Element QUANTITY = new Element ("Количество сотрудников",By.xpath("//*[@id=\"quantity\"]"));
    public static Element CREATION_REASON = new Element("Причина появления",By.xpath("//*[@id=\"creationReason\"]"));
    public static Element CONTRACT_0 = new Element("Трудовой договор",By.id("contractType-0"));
    public static Element CONTRACT_1 = new Element("Договор подряда",By.id("contractType-1"));
    public static Element CONTRACT_2 = new Element("Контракт",By.id("contractType-2"));
    public static Element SALARY = new Element("Зарплата",By.id("salary"));
    public static Element SALARY_BEL = new Element ("Бел",By.xpath("//select[@id = 'currency']//option[@value = '0']"));
    public static Element SALARY_RUS = new Element ("Рос",By.xpath("//select[@id = 'currency']//option[@value = '1']"));
    public static Element SALARY_USD = new Element("Дол",By.xpath("//select[@id = 'currency']//option[@value = '2']"));
    public static Element SALARY_EUR = new Element("Евро",By.xpath("//select[@id = 'currency']//option[@value = '3']"));
    public static Element JOB_1 = new Element ("Полная занятность",By.xpath("//*[@id=\"jobType\"]/option[1]"));
    public static Element JOB_2 = new Element("Частичная",By.xpath("//*[@id=\"jobType\"]/option[2]"));
    public static Element JOB_3 = new Element("Проектная работа",By.xpath("//*[@id=\"jobType\"]/option[3]"));
    public static Element JOB_4 = new Element("Стажировка",By.xpath("//*[@id=\"jobType\"]/option[4]"));
    public static Element BUSINESS_TRIP = new Element("Командировки", By.id("businessTrip"));
    public static Element TIMEWORK =new Element("График работы", By.id("timetable"));
    public static Element PROBATION =new Element("Испытательный срок", By.id("probationPeriod"));
    public static Element RESPONSIBILITIES =new Element("Обязанности", By.id("responsibilities"));
    public static Element CANDIDATE_EXTERNAL =new Element("Внешний кандидат", By.id("candidateTypeExternal"));
    public static Element CANDIDATE_INTERNAL =new Element("Внутренний кандидат", By.id("candidateTypeInternal"));
    public static Element EDUCATION_NO =new Element("не имеет значения", By.xpath("//select[@id = 'education']//option[@value = '-1']"));
    public static Element EDUCATION_1 =new Element("общее среднее", By.xpath("//select[@id = 'education']//option[@value = '1']"));
    public static Element EDUCATION_2 =new Element("техническое", By.xpath("//select[@id = 'education']//option[@value = '2']"));
    public static Element EDUCATION_3 =new Element("среднее специальное", By.xpath("//select[@id = 'education']//option[@value = '3']"));
    public static Element EDUCATION_4 =new Element("высшее", By.xpath("//select[@id = 'education']//option[@value = '4']"));
    public static Element EDUCATION_5 =new Element("незаконченное высшее", By.xpath("//select[@id = 'education']//option[@value = '5']"));

    public static Element EXPERIENCE_0 =new Element("не имеет значения", By.xpath("//select[@id = 'experience']//option[@value = '0']"));
    public static Element EXPERIENCE_1 =new Element("от 1", By.xpath("//select[@id = 'experience']//option[@value = '1']"));
    public static Element EXPERIENCE_3 =new Element("от 3", By.xpath("//select[@id = 'experience']//option[@value = '3']"));
    public static Element EXPERIENCE_5 =new Element("от 5", By.xpath("//select[@id = 'experience']//option[@value = '5']"));

    public static Element COMPETENCE_BUTTON =new Element("Добавить из каталога", By.id("editrequiredCompetence"));
    public static Element MS_OFFICE =new Element("Комп1", By.xpath("//span[text()='MS Office']"));
    public static Element MS_EXCEL = new Element("Комп2", By.xpath("//span[text() = 'MS Excel']"));
    public static Element OK_COMPETENCE_BUTTON =new Element("ОК", By.xpath("//button[text()='OK']"));
    public static Element COMMENT =new Element("Комментарий", By.id("comment"));
    public static Element SAVE_BUTTON =new Element("Сохранить", By.id("save"));

    public static Element AGREEMENT = new Element("Отправить на согласование",By.xpath("//*[@id=\"sendToApprovalButton\"]"));
    public static Element PARTNER_AGREEMENT = new Element("Участвующие в согласовании",By.xpath("//*[@id=\"approve\"]"));
    public static Element SELECT_PARTNER = new Element("Выберите участников",By.xpath("//*[@role-order='8']"));
    public static Element PARTNER = new Element("Участник(Кабанов)",By.xpath("//*[@id=\"5\"]"));
    public static Element OK_BUTTON = new Element("Кнопка Ок",By.xpath("//button[contains(.,'Ок')]"));
    public static Element APPROVE_BUTTON = new Element("Отправить на согласование 2",By.xpath("//*[@id=\"approveButton\"]"));
    public static Element APPROVE = new Element("Согласовать",By.xpath("//*[@id=\"approveButton\"]"));

    public static Element CREATE_VACANCY_BUTTON = new Element("Кнопка создания Вакансии",By.xpath("//*[@id=\"createVacancyButton\"]"));
    public static Element ANNUL_BUTTON = new  Element("Аннулировать",By.xpath("//*[@id=\"annulAppButton\"]"));
    public static Element REWORK_BUTTON = new Element("",By.xpath("//*[@id=\"reworkButton\"]"));
    public static Element REJECT_BUTTON = new Element("",By.xpath("//*[@id=\"rejectButton\"]"));
    public static Element CLOSE_DATE = new Element("Дата закрытия",By.xpath("//*[@id=\"plannedClosingDate\"]"));
    public static Element SAVE_VACANCY = new Element("Сохранить вакансию",By.xpath("//*[@id=\"saveButton\"]"));

    //*[@id="p_p_id_TCVacancies_WAR_TCRecruitingAndOnboardingportlet_"]

    public static String URL_APPL_CREAT_VACANCY="http://testing.cld.iba.by/web/guest/recruiting/applications/-/applications/515/status/Approved";
    public static String URL_APPL_ANNUL ="http://testing.cld.iba.by/web/guest/recruiting/applications/-/applications/509/status/Approved";
    public static String URL_APPL = "http://testing.cld.iba.by/web/guest/recruiting/applications/-/applications/510";
}

