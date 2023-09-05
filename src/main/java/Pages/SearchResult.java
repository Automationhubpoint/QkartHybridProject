//package Pages;
// 
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class SearchResult {
//   WebElement parentElement;
//
//   public SearchResult(WebElement SearchResultElement) {
//       this.parentElement = SearchResultElement;
//   }
//
//   /*
//    * Return title of the parentElement denoting the card content section of a
//    * search result
//    */
//   public String getTitleofResult() {
//       String titleOfSearchResult = "";
//       // Find the element containing the title (product name) of the search result and
//       // assign the extract title text to titleOfSearchResult
//       WebElement element = parentElement.findElement(By.className("css-yg30e6"));
//       titleOfSearchResult = element.getText();
//       return titleOfSearchResult;
//   }
//
//   /*
//    * Return Boolean denoting if the open size chart operation was successful
//    */
//   // TODO: CRIO_TASK_MODULE_XPATH - M2_3 Update locators to use Xpath
//   public Boolean openSizechart() {
//       try {
//           // Find the link of size chart in the parentElement and click on it
//           WebElement element = parentElement.findElement(By.tagName("button"));
//           element.click();
//
//           Thread.sleep(3000);
//           return true;
//       } catch (Exception e) {
//           System.out.println("Exception while opening Size chart: " + e.getMessage());
//           return false;
//       }
//   }
//
//   /*
//    * Return Boolean denoting if the close size chart operation was successful
//    */
//   public Boolean closeSizeChart(WebDriver driver) {
//       try {
//           synchronized (driver) {
//               driver.wait(2000);
//           }
//           
//           Actions action = new Actions(driver);
//
//           // Clicking on "ESC" key closes the size chart modal
//           action.sendKeys(Keys.ESCAPE);
//           action.perform();
//
//           WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(30));
//           wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("MuiDialog-paperScrollPaper")));
//
//           return true;
//       } catch (Exception e) {
//           System.out.println("Exception while closing the size chart: " + e.getMessage());
//           return false;
//       }
//   }
//
//   /*
//    * Return Boolean based on if the size chart exists
//    */
//   public Boolean verifySizeChartExists() {
//       Boolean status = false;
//       try {
//           /*
//            * Check if the size chart element exists. If it exists, check if the text of
//            * the element is "SIZE CHART". If the text "SIZE CHART" matches for the
//            * element, set status = true , else set to false
//            */
//           WebElement element = parentElement.findElement(By.tagName("button"));
//           Thread.sleep(1000);
//           status = element.getText().equals("SIZE CHART");
//
//           return status;
//       } catch (Exception e) {
//           return status;
//       }
//   }
//
//   /*
//    * Return Boolean if the table headers and body of the size chart matches the
//    * expected values
//    */
//   public Boolean validateSizeChartContents(List<String> expectedTableHeaders, List<List<String>> expectedTableBody,
//           WebDriver driver) {
//       Boolean status = true;
//       try {
//           // TODO: CRIO_TASK_MODULE_TEST_AUTOMATION - TEST CASE 04: MILESTONE 2
//           /*
//            * Locate the table element when the size chart modal is open
//            * 
//            * Validate that the contents of expectedTableHeaders is present as the table
//            * header in the same order
//            * 
//            * Validate that the contents of expectedTableBody are present in the table body
//            * in the same order
//            */
//           List <WebElement> tableheader = driver.findElements(By.xpath("/html/body/div[2]/div[3]/div/div/table/thead/tr/th"));
//           
//           Thread.sleep(2000);
//           int size = tableheader.size() ; 
//
//           if(size != expectedTableHeaders.size()) { 
//               System.out.println("Expected TableHeader is missing ");
//               return false ; 
//            }
//            int i = 0 ;
//           for(WebElement head : tableheader)
//           { 
//               
//              if(!head.getText().equalsIgnoreCase(expectedTableHeaders.get(i))){
//                   System.out.println("Expected TableHeader is missing ");
//                    return status = false ;
//               }
//               else {
//                   status = true ;
//               }
//
//               i++ ;
//               Thread.sleep(2000);
//
//           }
//
//
// for( i =0 ;  i < expectedTableBody.size() ; i++)
// {
// List <String> expectedTableBodyrow =  expectedTableBody.get(i);
// 
// for(int j = 0 ; j < expectedTableBodyrow.size() ; j++)
// {
////user1 /user2
////2. / 3
//    String expectedTableBodytext = expectedTableBodyrow.get(j);
//
//    int row = i + 1 ;
//    int column =  j + 1 ;
//
//    //0 1 3 5 7 
//    WebElement actualTableBody = driver.findElement(By.xpath(" /html/body/div[2]/div[3]/div/div/table/tbody/tr["+row+"]/td["+column+"]")); 
//
//    if(!actualTableBody.getText().equalsIgnoreCase(expectedTableBodytext))
//    {
//       System.out.println("Table Content are missing");
//       status = false ;
//       
//     }
//       
//       }
//       }
//
//
//
//
//
//
//
//
//
//
//
//           return status;
//
//       } catch (Exception e) {
//           System.out.println("Error while validating chart contents");
//           return false;
//       }
//   }
//
//   /*
//    * Return Boolean based on if the Size drop down exists
//    */
//   public Boolean verifyExistenceofSizeDropdown(WebDriver driver) {
//       Boolean status = false;
//       try {
//           // If the size dropdown exists and is displayed return true, else return false
//           WebElement element = driver.findElement(By.className("css-13sljp9"));
//           status = element.isDisplayed();
//           return status;
//       } catch (Exception e) {
//           return status;
//       }
//   }
//}
