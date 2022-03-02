package Homework_19;

import Homework_19.Task_1.Animal;
import Homework_19.Task_1.Dog;
import Homework_19.Task_2.Accounting;
import Homework_19.Task_2.FinancialAccount;
import Homework_19.Task_2.TaxAccounting;
import Homework_19.Task_3.ItCompany;
import Homework_19.Task_3.Marketing;
import Homework_19.Task_3.SEO;
import Homework_19.Task_3.SMM;


public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.voice();
        animal.eat();

        dog.voice();
        dog.eat();

        Accounting accounting = new Accounting();
        FinancialAccount financialAccount = new FinancialAccount();
        TaxAccounting taxAccounting = new  TaxAccounting();

        accounting.account();
        financialAccount.account();
        taxAccounting.account();

        ItCompany itCompany = new ItCompany();
        Homework_19.Task_3.Accounting accounting1 = new Homework_19.Task_3.Accounting();
        Homework_19.Task_3.FinancialAccount financialAccount1 = new Homework_19.Task_3.FinancialAccount();
        Homework_19.Task_3.TaxAccounting taxAccounting1 = new Homework_19.Task_3.TaxAccounting();
        Marketing marketing = new Marketing();
        SEO seo = new SEO();
        SMM smm = new SMM();

        itCompany.account();
        accounting1.account();
        financialAccount1.account();
        taxAccounting1.account();
        marketing.marketing();
        seo.marketing();
        smm.marketing();

    }
}
