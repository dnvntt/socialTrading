/**
 * OnlineTradingServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface OnlineTradingServiceSoap extends java.rmi.Remote {
    public org.tempuri.CreateOrderResult createOrder(org.tempuri.AuthenticationHeader header, org.tempuri.Order order) throws java.rmi.RemoteException;
    public org.tempuri.GetOrdersSell4VndResult getOrderOddQttySell4Vnd(org.tempuri.AuthenticationHeader header, org.tempuri.SearchOrdersell4Vnd searchOrder) throws java.rmi.RemoteException;
    public org.tempuri.OrderWithOddQttySell4VndResult createOrderOddQttySell4Vnd(org.tempuri.AuthenticationHeader header, org.tempuri.OddQttyOrderSell4Vnd order) throws java.rmi.RemoteException;
    public org.tempuri.OrderWithOddQttyResult createOrderOddQtty(org.tempuri.AuthenticationHeader header, org.tempuri.OddQttyOrder order) throws java.rmi.RemoteException;
    public org.tempuri.GetOddQttyOrdersResult getOddQttyOrders(org.tempuri.AuthenticationHeader header, org.tempuri.SearchOddQttyOrderInfo searchOrder) throws java.rmi.RemoteException;
    public org.tempuri.GetOrderResult getOrder(org.tempuri.AuthenticationHeader header, org.tempuri.Order order) throws java.rmi.RemoteException;
    public org.tempuri.GetOrdersResult getOrders(org.tempuri.AuthenticationHeader header, org.tempuri.SearchOrderInfo searchOrder) throws java.rmi.RemoteException;
    public org.tempuri.SearchOrderbookResult getOrderbook(org.tempuri.AuthenticationHeader header, org.tempuri.SearchOrderbook searchOrder) throws java.rmi.RemoteException;
    public org.tempuri.GetOrderDetailResult getOrderDetail(org.tempuri.AuthenticationHeader header, org.tempuri.Order order) throws java.rmi.RemoteException;
    public org.tempuri.GetPortfoliosResult getPortfolios(org.tempuri.AuthenticationHeader header, java.lang.String contractNo) throws java.rmi.RemoteException;
    public org.tempuri.GetTransactionsResult getTransactions(org.tempuri.AuthenticationHeader header, org.tempuri.SearchTransactionInfo searchTransaction) throws java.rmi.RemoteException;
    public org.tempuri.GetCF0023Result getCF0023(org.tempuri.AuthenticationHeader header, org.tempuri.SearchCF0023Info searchCF0023) throws java.rmi.RemoteException;
    public org.tempuri.GetCF0036Result getCF0036(org.tempuri.AuthenticationHeader header, org.tempuri.SearchCF0036Info searchCF0036) throws java.rmi.RemoteException;
    public org.tempuri.GetCustomerIDResult getCustomerID(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException;
    public org.tempuri.GetPaymentAmountAdvancedsResult getPaymentAmountAdvanceds(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException;
    public org.tempuri.EstimatePaymentAmountAdvancedResult estimatePaymentAmountAdvanced(org.tempuri.AuthenticationHeader header, org.tempuri.EstimatePaymentAmountAdvanced estimatePaymentAdvanced) throws java.rmi.RemoteException;
    public org.tempuri.EstimatePaymentAmountAdvancedResult confirmPaymentAmountAdvanced(org.tempuri.AuthenticationHeader header, org.tempuri.EstimatePaymentAmountAdvanced confirmPaymentAdvanced) throws java.rmi.RemoteException;
    public org.tempuri.CancelOrderResult cancelOrder(org.tempuri.AuthenticationHeader header, org.tempuri.Order order) throws java.rmi.RemoteException;
    public org.tempuri.OrderCancelsResult cancelOrderList(org.tempuri.AuthenticationHeader header, org.tempuri.CancelOrderIds orderIDs) throws java.rmi.RemoteException;
    public org.tempuri.UpdateOrderResult updateOrder(org.tempuri.AuthenticationHeader header, org.tempuri.Order order) throws java.rmi.RemoteException;
    public org.tempuri.SearchStockOptionRegisterResult searchStockOptionRegister(org.tempuri.AuthenticationHeader header, org.tempuri.SearchStockOptionRegister searchStock) throws java.rmi.RemoteException;
    public org.tempuri.AddStockOptionRegisterResult addStockOptionRegister(org.tempuri.AuthenticationHeader header, org.tempuri.AddStockOptionRegister addStock) throws java.rmi.RemoteException;
    public org.tempuri.SearchStockOptionResult searchStockOption(org.tempuri.AuthenticationHeader header, org.tempuri.SearchStockOption searchStock) throws java.rmi.RemoteException;
    public org.tempuri.GetDepositRatioResult getDepositRatio(org.tempuri.AuthenticationHeader header, org.tempuri.GetDepositRatio getDeposit) throws java.rmi.RemoteException;
    public org.tempuri.GetBalancesResult getBalances(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException;
    public org.tempuri.GetAccountsResult getAccounts(org.tempuri.AuthenticationHeader header, java.lang.String customerId) throws java.rmi.RemoteException;
    public java.lang.String getAutoAdvance(org.tempuri.AuthenticationHeader header, java.lang.String account) throws java.rmi.RemoteException;
    public org.tempuri.GetPositionsResult getPositions(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException;
    public org.tempuri.GetPositions1Result getPositions1(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException;
    public org.tempuri.GetUserProfileResult getUserProfile(org.tempuri.AuthenticationHeader header, java.lang.String customerID, java.lang.String contractNo) throws java.rmi.RemoteException;
    public org.tempuri.UpdateUserProfileResult updateUserProfile(org.tempuri.AuthenticationHeader header, org.tempuri.UserProfile userProfile) throws java.rmi.RemoteException;
    public org.tempuri.GetPPSEResult getPPSE(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber, java.lang.String symbol, double price) throws java.rmi.RemoteException;
    public org.tempuri.GetMarginContractInfoResult getMarginContractInfo(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException;
    public org.tempuri.GetDebtAmountReportResult getDebtAmountReport(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException;
    public java.lang.String getCoreStatus(org.tempuri.AuthenticationHeader header) throws java.rmi.RemoteException;
    public org.tempuri.GetSecMarginInfoResult getSecMarginInfo(org.tempuri.AuthenticationHeader header, java.lang.String symbol, java.lang.String productType) throws java.rmi.RemoteException;
    public org.tempuri.GetTdTypeListResult getTdTypeList(org.tempuri.AuthenticationHeader header) throws java.rmi.RemoteException;
    public org.tempuri.GetTdTypeDetailResult getTdTypeDetail(org.tempuri.AuthenticationHeader header, java.lang.String tdtype) throws java.rmi.RemoteException;
    public org.tempuri.GetWithDrawalTermDepositResult confirmWithDrawalTermDeposit(org.tempuri.AuthenticationHeader header, org.tempuri.WithdrawalTermDepositRequest[] withDrawalTermDepositRequestCollection) throws java.rmi.RemoteException;
    public org.tempuri.ConfirmTermDepositResult confirmTermDeposit(org.tempuri.AuthenticationHeader header, double amt, java.lang.String tdtype) throws java.rmi.RemoteException;
    public org.tempuri.CreateTermDepositResult createTermDeposit(org.tempuri.AuthenticationHeader header, double amt, java.lang.String tdtype, java.lang.String acctno) throws java.rmi.RemoteException;
    public org.tempuri.WithDrawalTermDepositResult withDrawalTermDeposit(org.tempuri.AuthenticationHeader header, org.tempuri.WithdrawalTermDepositRequest[] withDrawalTermDepositRequestCollection) throws java.rmi.RemoteException;
    public org.tempuri.ChangeAutoAdvanceResult changeAutoAdvance(org.tempuri.AuthenticationHeader header, java.lang.String account, java.lang.String autoAdvance) throws java.rmi.RemoteException;
    public org.tempuri.GetTDTransactionConllectionResult getTDTransactionsStatus(org.tempuri.AuthenticationHeader header, org.tempuri.SearchTransactionTDInfo searchTransactionTDInfo) throws java.rmi.RemoteException;
    public org.tempuri.GetTDTransactionDetailResult getTDTransactionsDetail(org.tempuri.AuthenticationHeader header, org.tempuri.SearchTransactionTDInfo searchTransactionTDInfo) throws java.rmi.RemoteException;
    public org.tempuri.GetTDTransactionDetailResult getTdAvlList(org.tempuri.AuthenticationHeader header, org.tempuri.SearchTransactionTDInfo searchTransactionTDInfo) throws java.rmi.RemoteException;
    public org.tempuri.GetTdMastListResult getTdMastList(org.tempuri.AuthenticationHeader header, java.lang.String acctno) throws java.rmi.RemoteException;
    public org.tempuri.GetTDEODListResult getTdEOTDList(org.tempuri.AuthenticationHeader header, java.lang.String acctno, double dateAmt) throws java.rmi.RemoteException;
    public org.tempuri.GetOrderDfReportResult getOrderDfReport(org.tempuri.AuthenticationHeader header, java.lang.String afacctno) throws java.rmi.RemoteException;
    public org.tempuri.GetOrderbooksResult searchOrderBooks(org.tempuri.AuthenticationHeader header, org.tempuri.SearchOrderbookInfo searchOrderbookInfo) throws java.rmi.RemoteException;
    public org.tempuri.GetOrderDFAdvancedPaymentAmountResult getOrderDFAdvancedPaymentAmount(org.tempuri.AuthenticationHeader header, java.lang.String afacctno) throws java.rmi.RemoteException;
    public org.tempuri.ConfirmOrderBooksResult confirmOrderBooks(org.tempuri.AuthenticationHeader header, org.tempuri.OrderConfirm[] confirmOrder) throws java.rmi.RemoteException;
    public org.tempuri.ConfirmDFAdvPaymentAmountResult confirmOrderDFAdvancedPaymentAmount(org.tempuri.AuthenticationHeader header, java.lang.String afacctno, org.tempuri.AdvPaymentAmt[] advPaymentAmt) throws java.rmi.RemoteException;
    public org.tempuri.ConfirmDFAdvPaymentAmountResult createOrderDFAdvancedPaymentAmount(org.tempuri.AuthenticationHeader header, java.lang.String afacctno, org.tempuri.AdvPaymentAmt[] advPaymentAmt) throws java.rmi.RemoteException;
    public org.tempuri.GetMyInfoResult getMyInfo(org.tempuri.AuthenticationHeader header, java.lang.String customerId) throws java.rmi.RemoteException;
    public org.tempuri.UpdateMyInfoResult updateMyInfo(org.tempuri.AuthenticationHeader header, org.tempuri.MyInfo myInfo) throws java.rmi.RemoteException;
    public org.tempuri.UpdateMyInfoResult updateNotificationEmail(org.tempuri.AuthenticationHeader header, org.tempuri.MyInfo myInfo) throws java.rmi.RemoteException;
    public org.tempuri.GetAccountPreferencesResult getAccountPreferences(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException;
    public org.tempuri.GetAccountFeaturesResult getAccountFeatures(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException;
    public org.tempuri.UpdateAccountFeaturesResult updateAccountFeatures(org.tempuri.AuthenticationHeader header, org.tempuri.AccountFeatures accountFeatures) throws java.rmi.RemoteException;
    public org.tempuri.UpdateAccountPreferencesResult updateAccountPreferences(org.tempuri.AuthenticationHeader header, org.tempuri.AccountPreferences accountPreferences) throws java.rmi.RemoteException;
}
