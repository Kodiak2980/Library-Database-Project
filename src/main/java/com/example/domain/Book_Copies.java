package com.example.domain;

public class Book_Copies {
	
	private long BookId;
	private long BranchId;
	private int No_Of_Copies;
	
	/**
	 * @param BookId
	 * @param BranchId
	 * @Param No_Of_Copies
	 */
	
	public Book_Copies (long BookId, long BranchId, int No_Of_Copies)
	{
		super();
		this.BookId = BookId;
		this.BranchId = BranchId;
		this.No_Of_Copies = No_Of_Copies;
	}
	
	@Override
	public String toString() {
		return "Book_Copies [BookId=" + BookId + ", BranchId=" + BranchId + ", No_Of_Copies=" + No_Of_Copies + "]";
	}

	public long getBookId() {
		return BookId;
	}

	public void setBookId(long bookId) {
		BookId = bookId;
	}

	public long getBranchId() {
		return BranchId;
	}

	public void setBranchId(long branchId) {
		BranchId = branchId;
	}

	public int getNo_Of_Copies() {
		return No_Of_Copies;
	}

	public void setNo_Of_Copies(int no_Of_Copies) {
		No_Of_Copies = no_Of_Copies;
	}
	
}
