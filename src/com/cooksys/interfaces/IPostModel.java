package com.cooksys.interfaces;

public interface IPostModel {
	
	/**
	 * TODO
	 * @return
	 */
	public String getPostId();
	
	
	/**
	 * 
	 * @return
	 */
	public String getBody();
	
	/**
	 * TODO
	 * @return
	 */
	public String getPostedBy();
	
	/**
	 * TODO
	 * @return
	 */
	public String getPostedTo();
	
	/**
	 * TODO
	 * @return
	 */
	public String getPostedDate();
	
	/**
	 * TODO
	 */
	public IAccountModel getAccountPostedBy();
	
	/**
	 * 
	 */
	public int getPostedById();
	
	/**
	 * 
	 */
	public int getPostedToId();
	
	/**
	 * TODO
	 * @return
	 */
	public IAccountModel getAccountPostedTo();
	
	
}
