/**
	����� ��������� �����������
*/

public class Calculator {
	/**
		��������� ����������
	*/
	private int result;

	/**
		��������� ���������.
	*/
	public void add (int ... params) {
		for (Integer param : parems) {
			this.result += param;
		}
	}

	/**
		�������� ���������.
		@return ��������� ����������.
	*/
	public int getResult() {
		return this.result;
	}

	/**
		�������� ��������� ����������.
	*/
	public void cleanResult() {
		this.result = 0;
	}
}