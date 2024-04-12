package com.Finance.exmanager.util;

import com.Finance.exmanager.DTO.BusinessDTO;
import com.Finance.exmanager.DTO.ExpenseDTO;
import com.Finance.exmanager.DTO.ProductDTO;
import com.Finance.exmanager.DTO.RevenueDTO;
import com.Finance.exmanager.DTO.UserDTO;
import com.Finance.exmanager.model.Business;
import com.Finance.exmanager.model.Expense;
import com.Finance.exmanager.model.Product;
import com.Finance.exmanager.model.Revenue;
import com.Finance.exmanager.model.User;

public class DTOMapper {
  public class BusinessMapper{
  public static BusinessDTO mapToBusiness(Business business) {
      BusinessDTO businessDTO = new BusinessDTO();
      businessDTO.setId(business.getId());
      businessDTO.setBusinessName(business.getBusinessName());
      businessDTO.setBusinessType(business.getBusinessType());
      businessDTO.setUserId(business.getUser().getId());
      return businessDTO;
  }

  public static Business mapFromBusiness(BusinessDTO businessDTO) {
      Business business = new Business();
      business.setId(businessDTO.getId());
      business.setBusinessName(businessDTO.getBusinessName());
      business.setBusinessType(businessDTO.getBusinessType());
      User user = new User();
      user.setId(businessDTO.getUserId());
      business.setUser(user);
      return business;
  }
}
  public class ExpenseMapper {
    public static ExpenseDTO mapToExpense(Expense expense) {
        ExpenseDTO expenseDTO = new ExpenseDTO();
        expenseDTO.setId(expense.getId());
        expenseDTO.setExpenseName(expense.getExpenseName());
        expenseDTO.setExpenseAmount(expense.getExpenseAmount());
        expenseDTO.setExpenseDate(expense.getExpenseDate());
        expenseDTO.setBusinessId(expense.getBusiness().getId());
        return expenseDTO;
    }

    public static Expense mapFromExpense(ExpenseDTO expenseDTO) {
        Expense expense = new Expense();
        expense.setId(expenseDTO.getId());
        expense.setExpenseName(expenseDTO.getExpenseName());
        expense.setExpenseAmount(expenseDTO.getExpenseAmount());
        expense.setExpenseDate(expenseDTO.getExpenseDate());
        Business business = new Business();
        business.setId(expenseDTO.getBusinessId());
        expense.setBusiness(business);
        return expense;
    }

}
public class RevenueMapper {
  public static RevenueDTO mapToRevenue(Revenue revenue) {
      RevenueDTO revenueDTO = new RevenueDTO();
      revenueDTO.setId(revenue.getId());
      revenueDTO.setProductName(revenue.getProductName());
      revenueDTO.setQuantitySold(revenue.getQuantitySold());
      revenueDTO.setSalePrice(revenue.getSalePrice());
      revenueDTO.setSaleDate(revenue.getSaleDate());
      revenueDTO.setBusinessId(revenue.getBusiness().getId());
      return revenueDTO;
  }

  public static Revenue mapFromRevenue(RevenueDTO revenueDTO) {
      Revenue revenue = new Revenue();
      revenue.setId(revenueDTO.getId());
      revenue.setProductName(revenueDTO.getProductName());
      revenue.setQuantitySold(revenueDTO.getQuantitySold());
      revenue.setSalePrice(revenueDTO.getSalePrice());
      revenue.setSaleDate(revenueDTO.getSaleDate());
      Business business = new Business();
      business.setId(revenueDTO.getBusinessId());
      revenue.setBusiness(business);
      return revenue;
  }
}public class UserMapper {
  public static UserDTO mapToUser(User user) {
      UserDTO userDTO = new UserDTO();
      userDTO.setId(user.getId());
      userDTO.setUsername(user.getUsername());
      userDTO.setEmail(user.getEmail());
      return userDTO;
  }

  public static User mapFromUser(UserDTO userDTO) {
      User user = new User();
      user.setId(userDTO.getId());
      user.setUsername(userDTO.getUsername());
      user.setEmail(userDTO.getEmail());
      user.setPassword(userDTO.getPassword());
      return user;
  }
}
public class ProductMapper {
  public static ProductDTO mapToProduct(Product product) {
      ProductDTO productDTO = new ProductDTO();
      productDTO.setId(product.getId());
      productDTO.setProductName(product.getProductName());
      productDTO.setProductPrice(product.getProductPrice());
      productDTO.setProductQuantity(product.getProductQuantity());
      productDTO.setBusinessId(product.getBusiness().getId());
      return productDTO;
  }

  public static Product mapFromProduct(ProductDTO productDTO) {
      Product product = new Product();
      product.setId(productDTO.getId());
      product.setProductName(productDTO.getProductName());
      product.setProductPrice(productDTO.getProductPrice());
      product.setProductQuantity(productDTO.getProductQuantity());
      Business business = new Business();
      business.setId(productDTO.getBusinessId());
      product.setBusiness(business);
      return product;
  }
}
}