package com.zhbit.utils;

/**
 * Created by zhbitcxy.
 * 分页类
 */
public class Page {
    protected long rowCount = 0;   //总记录数
    protected int currentPage = 1; //当前页码
    protected int sizePerPage = 10; //每页显示条数
    protected int pageCount = 0; //总页数
    protected int offset = 3; //偏移量

    public Page(long rowCount, int currentPage, int sizePerPage) {
        this.rowCount = rowCount;
        this.currentPage = currentPage;
        this.sizePerPage = sizePerPage;
        this.pageCount = (int)Math.ceil( (double)rowCount / (double)sizePerPage );

        if (currentPage < 1) this.currentPage = 1;
        if (currentPage > pageCount) this.currentPage = this.pageCount;
    }
    public String show(){
        StringBuffer sb = new StringBuffer();
        String firstPage = "<li><a href=\"1\">首页</a></li>";
        String prevPage = "<li><a href=\""+(getCurrentPage()-1)+"\"><<上一页</a></li>";
        String nextPage = "<li><a href=\""+(getCurrentPage()+1)+"\">下一页>></a></li>";
        String lastPage = "<li><a href=\""+getPageCount()+"\">尾页</a></li>";
        String currentPage = "<li class=\"active\"><a href=\""+getCurrentPage()+"\">"+getCurrentPage()+"</a></li>";
        //只有一页不分页
        if (getPageCount()>1){
            //添加首页
           sb.append(firstPage);
            if (getCurrentPage()>1){
                //添加上一页
                sb.append(prevPage);
                int start = getCurrentPage() - getOffset();
                if (start < 1) start = 1;
                //添加到当前页最大数量不超过偏移数的页链接
                for(int i =  start; i < getCurrentPage(); i++){
                    sb.append("<li><a href=\""+i+"\">"+i+"</a></li>");
                }
            }
            //添加当前页
            sb.append(currentPage);
            int end = getCurrentPage() + getOffset();
            if (end > getPageCount()) end = getPageCount();
            //添加从当前页开始最大数量不超过偏移数的页连接
            for(int i = getCurrentPage()+1; i<= end; i++){
                sb.append("<li><a href=\""+i+"\">"+i+"</a></li>");
            }

            if (getCurrentPage()+1 <= getPageCount()){
                //添加下一页
                sb.append(nextPage);
            }
            //添加最后一页
            sb.append(lastPage);
        }

        return sb.toString();
    }

    public long getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getSizePerPage() {
        return sizePerPage;
    }

    public void setSizePerPage(int sizePerPage) {
        this.sizePerPage = sizePerPage;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
