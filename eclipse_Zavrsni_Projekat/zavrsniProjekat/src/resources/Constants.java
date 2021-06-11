package resources;

public class Constants {
	//TestHumanityPage
	public static String URL_SHIFT_PLANNING = "https://kompanija254.humanity.com/app/schedule/employee/week/overview/overview/5%2c5%2c2021/";
	public static String URL_TIME_CLOCK = "https://kompanija254.humanity.com/app/timeclock/";
	public static String URL_LEAVE = "https://kompanija254.humanity.com/app/requests/vacation/";
	public static String URL_TRAINING = "https://kompanija254.humanity.com/app/training/";
	public static String URL_STAFF = "https://kompanija254.humanity.com/app/staff/list/load/true/";
	public static String URL_AVAILABILITY = "https://kompanija254.humanity.com/fe/availability/";
	public static String URL_PAYROLL = "https://kompanija254.humanity.com/app/payroll/scheduled-hours/";
	public static String URL_REPORTS = "https://kompanija254.humanity.com/app/reports/dashboard/";
	public static String URL_SETTINGS = "https://kompanija254.humanity.com/app/admin/settings/";
	public static String URL_LOGO = "https://kompanija254.humanity.com/app/dashboard/";
	//HumanityPage
	public static final String URL_DASHBOARD = "https://kompanija254.humanity.com/app/dashboard/";
	public static final String BTN_SP_XPATH = "//*[@id=\"sn_schedule\"]/span"; 
	public static final String BTN_TC_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	public static final String BTN_LEAVE = "//*[@id=\"sn_requests\"]/span";
	public static final String BTN_TRAINING = "//*[@id=\"sn_training\"]/span";
	public static final String BTN_STAFF = "//*[@id=\"sn_staff\"]/span";
	public static final String BTN_AVAILABILITY = "//*[@id=\"sn_availability\"]/span";
	public static final String BTN_PAYROLL = "//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[2]/div[8]/a";
	public static final String BTN_REPORTS = "//*[@id=\"sn_reports\"]/span";
	public static final String BTN_SETTINGS = "//*[@id=\"sn_admin\"]/span";
	public static final String BTN_LOGO = "//*[@id=\"_nav\"]/div[1]/img";
	//TestHomepage
	public static String EXPECTED_LOGIN = "https://kompanija254.humanity.com/app/dashboard/";
	public static final String HUMANITY_LOGO_XPATH = "//*[@id=\"dashboardtl_\"]/div[2]";
	public static final String ABOUT_US_PAGE = "https://www.humanity.com/about";
	//Homepage
	public static final String URL_HUMANITY = "https://www.humanity.com/";
	public static final String ABOUTBTN_XPATH = "//*[@id=\"wrapper\"]/footer/div[2]/div/div/div[1]/div[5]/ul/li[1]/a";
	public static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String USERNAME_XPATH = "//*[@id=\"email\"]";
	public static final String PASSWORD_XPATH = "//*[@id=\"password\"]";
	public static final String LOG_IN_BTN_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	public static final String X_BTN_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String OK_SPAM_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[1]/button/span";
	public static final String NOTNX_SPAM_XPATH = "public static final String OK_SPAM_XPATH";
	public static final String USERNAME = "milancajic11622747702";
	public static final String PASSWORD = "milan1995";
	//StaffPage
	public static final String BTN_ADD_EMPLOYEES = "//*[@id=\"act_primary\"]";
	public static final String INPUT_FIRST_NAME = "//*[@id=\"_asf1\"]";
	public static final String INPUT_LAST_NAME = "//*[@id=\"_asl1\"]";
	public static final String INPUT_EMAIL = "//*[@id=\"_ase1\"]";
	public static final String BTN_SAVE_EMPLOYEES_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[2]/button";
	public static final String BTN_ALL_STAFF_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[1]/div/div/div[1]/ul[1]/li[1]/a";
	public static final String LIST_EMPLOYEES_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/div/div[2]";
	public static final String TABLE_LIST_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/div/div[2]";
	public static final String FIRST_EMPL_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/a";
	public static final String EDIT_DETAILS_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[1]/a[2]";
	public static final String INPUT_EDITED_NAME_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[1]/td[2]/input";
	public static final String SUBMIT_NAME_CHANGE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
	public static final String CELL_FIRST_NAME = "//*[@id=\"7\"]";
	public static final String CELL_EMAIL = "//*[@id=\"10\"]";
	//SettingsPage
	public static final String LANGUAGE_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String SERBIAN_LANGUAGE_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select/option[37]";
	public static final String SAVE_SETTINGS = "//*[@id=\"_save_settings_button\"]";
	public static final String SAVE_SETTINGS2 = "//*[@id=\"act_primary\"]";
	public static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span/p";
	public static final String NOTIFICATIONS_EMAIL_XPATH = "//*[@id=\"pref_pref_email\"]";
	public static final String NOTIFICATIONS_SMS_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[2]/table/tbody/tr[2]/td[2]/input";
	public static final String NOTIFICATIONS_MOBILE_PUSH_XPATH= "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[2]/table/tbody/tr[3]/td[2]/input";
	//ProfilePage
	public static final String PROFILE_XPATH = "//*[@id=\"wrap_us_menu\"]";
	public static final String EDIT_PROFILE_XPATH = "//*[@id=\"userm\"]/div/a[2]";
	public static final String INPUT_NICKNAME_XPATH = "//*[@id=\"nick_name\"]";
	public static final String INPUT_ID_XPATH = "//*[@id=\"eid\"]";
	public static final String INPUT_ADDRESS_XPATH = "//*[@id=\"address\"]";
	public static final String CHOOSE_GENDER_XPATH = "//*[@id=\"gender\"]";
	public static final String SAVE_EMPLOYEE_XPATH = "//*[@id=\"act_primary\"]";
	public static final String URL_EDIT_PROFILE = "https://kompanija254.humanity.com/app/staff/edit/6358009/";
}
