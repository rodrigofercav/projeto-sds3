package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long totalVisited;
    private Long deals;

    public SaleSuccessDTO() { }
    
    public SaleSuccessDTO(Seller seller, Long totalVisited, Long deals) {
        this.sellerName = seller.getName();
        this.totalVisited = totalVisited;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getTotalVisited() {
        return totalVisited;
    }

    public void setTotalVisited(Long totalVisited) {
        this.totalVisited = totalVisited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
    
}
