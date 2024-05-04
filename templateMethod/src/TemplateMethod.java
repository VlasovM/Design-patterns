public class TemplateMethod {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n");

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

}
