package org.dimigo.exception;

@SuppressWarnings("serial")
public class AgeCheckException extends Exception{
	
	public AgeCheckException() {
		
	}
	
	public AgeCheckException(Movie movie) {
		super(movie.getTitle() + "은/는" + movie.getLimitAge() + "세 이상 관랍가 입니다.");
	}
}
