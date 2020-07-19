package com.automationpractice.qa.utility;

import com.automationpractice.qa.pages.TestBase;
import org.testng.annotations.DataProvider;


public class CustomDataProvider extends TestBase {

    XLReader xlReader;

    @DataProvider(name = "LoginData2")
    public Object[][] getData() throws Exception {

        Object[][] data = new Object[3][2];
        data[0][0] = "testautomation-practice@gmail.com";
        data[0][1] = "123456";
        data[1][0] = "testautomation-practice@gmail.com";
        data[1][1] = "123456";
        data[2][0] = "testautomation-practice@gmail.com";
        data[2][1] = "123456";

        return data;
    }


    @DataProvider(name = "LoginData")
    public Object[][] loginTestData() throws Exception {

        xlReader = new XLReader(properties.getProperty("excelPath"), "Registration");

        int rowCount = xlReader.getRowCount();
        int colCount = xlReader.getCellCount();

        Object[][] data = new Object[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            colCount = xlReader.getCellCount();
            for (int j = 0; j < colCount; j++) {
                data[i - 1][j] = xlReader.getCellData(i, j);
            }
        }
        System.out.println("Row Count: " + rowCount + " Column Count: " + colCount);
        return data;
    }
}