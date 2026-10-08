class  Day3_Task1_MouseActions {
public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://example.com/menu");
    Actions actions = new Actions(driver);

    WebElement menuItem = driver.findElement(By.id("menuItem"));
    actions.moveToElement(menuItem).perform();
    System.out.println("Hovered over menu item.");

    WebElement doubleClickTarget = driver.findElement(By.id("dblClickBtn"));
    actions.doubleClick(doubleClickTarget).perform();
    System.out.println("Double-clicked element.");

    WebElement rightClickTarget = driver.findElement(By.id("contextMenuArea"));
    actions.contextClick(rightClickTarget).perform();
    System.out.println("Right-clicked element.");

    driver.quit();
}
}

// Day3_Task2: Drag and Drop
class Day3_Task2_DragDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/dragdrop");

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        System.out.println("Drag and drop completed.");
        driver.quit();
    }
}

// Day3_Task3: Keyboard Actions
class Day3_Task3_KeyboardActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/form");
        Actions actions = new Actions(driver);

        WebElement firstField = driver.findElement(By.id("firstName"));
        firstField.click();
        firstField.sendKeys("John");

        actions.sendKeys(Keys.TAB).perform(); // move to next field
        actions.sendKeys("Doe").perform();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); // select all
        actions.sendKeys(Keys.ENTER).perform(); // submit

        System.out.println("Keyboard actions performed: TAB, text entry, CTRL+A, ENTER.");
        driver.quit();
    }
}