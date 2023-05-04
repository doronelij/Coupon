package com.doronPriject.myProject.beens.coupon;

import com.doronPriject.myProject.beens.category.Category;
import com.doronPriject.myProject.beens.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CouponRepo extends JpaRepository <Coupon,Integer> {

//    int countById(int id);

    boolean existsByTitleAndCompany_Id(String title, int id);

    List<Coupon> findByCompany_Id(int Id);

    List<Coupon> findByCompany_IdAndCategory(int Id, Category category);

    List<Coupon> findByPriceLessThanEqual(double price);







}
