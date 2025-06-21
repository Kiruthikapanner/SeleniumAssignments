package week3.day2;

public class Elements extends Button {
	

	public static void main(String[] args) {
		
		Elements elementOptions = new Elements();
		
		elementOptions.Click();
		elementOptions.setText("First Text");
		elementOptions.submit();
		
		TextField txOptions = new TextField();
		txOptions.getText();
		
		CheckBoxButton checkBoxOption = new CheckBoxButton();
		checkBoxOption.Click();
		checkBoxOption.clickCheckButton();
		
		RadioButton radioButtonOptions = new RadioButton();
		radioButtonOptions.selectRadioButton();
		
	}

}
