package org.tempuri;

public class OnlineTradingServiceSoapProxy implements org.tempuri.OnlineTradingServiceSoap {
  private String _endpoint = null;
  private org.tempuri.OnlineTradingServiceSoap onlineTradingServiceSoap = null;
  
  public OnlineTradingServiceSoapProxy() {
    _initOnlineTradingServiceSoapProxy();
  }
  
  public OnlineTradingServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initOnlineTradingServiceSoapProxy();
  }
  
  private void _initOnlineTradingServiceSoapProxy() {
    try {
      onlineTradingServiceSoap = (new org.tempuri.OnlineTradingServiceLocator()).getOnlineTradingServiceSoap();
      if (onlineTradingServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)onlineTradingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)onlineTradingServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (onlineTradingServiceSoap != null)
      ((javax.xml.rpc.Stub)onlineTradingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.OnlineTradingServiceSoap getOnlineTradingServiceSoap() {
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap;
  }
  
  public org.tempuri.CreateOrderResult createOrder(org.tempuri.AuthenticationHeader header, org.tempuri.Order order) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.createOrder(header, order);
  }
  
  public org.tempuri.GetOrdersSell4VndResult getOrderOddQttySell4Vnd(org.tempuri.AuthenticationHeader header, org.tempuri.SearchOrdersell4Vnd searchOrder) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getOrderOddQttySell4Vnd(header, searchOrder);
  }
  
  public org.tempuri.OrderWithOddQttySell4VndResult createOrderOddQttySell4Vnd(org.tempuri.AuthenticationHeader header, org.tempuri.OddQttyOrderSell4Vnd order) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.createOrderOddQttySell4Vnd(header, order);
  }
  
  public org.tempuri.OrderWithOddQttyResult createOrderOddQtty(org.tempuri.AuthenticationHeader header, org.tempuri.OddQttyOrder order) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.createOrderOddQtty(header, order);
  }
  
  public org.tempuri.GetOddQttyOrdersResult getOddQttyOrders(org.tempuri.AuthenticationHeader header, org.tempuri.SearchOddQttyOrderInfo searchOrder) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getOddQttyOrders(header, searchOrder);
  }
  
  public org.tempuri.GetOrderResult getOrder(org.tempuri.AuthenticationHeader header, org.tempuri.Order order) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getOrder(header, order);
  }
  
  public org.tempuri.GetOrdersResult getOrders(org.tempuri.AuthenticationHeader header, org.tempuri.SearchOrderInfo searchOrder) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getOrders(header, searchOrder);
  }
  
  public org.tempuri.SearchOrderbookResult getOrderbook(org.tempuri.AuthenticationHeader header, org.tempuri.SearchOrderbook searchOrder) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getOrderbook(header, searchOrder);
  }
  
  public org.tempuri.GetOrderDetailResult getOrderDetail(org.tempuri.AuthenticationHeader header, org.tempuri.Order order) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getOrderDetail(header, order);
  }
  
  public org.tempuri.GetPortfoliosResult getPortfolios(org.tempuri.AuthenticationHeader header, java.lang.String contractNo) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getPortfolios(header, contractNo);
  }
  
  public org.tempuri.GetTransactionsResult getTransactions(org.tempuri.AuthenticationHeader header, org.tempuri.SearchTransactionInfo searchTransaction) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getTransactions(header, searchTransaction);
  }
  
  public org.tempuri.GetCF0023Result getCF0023(org.tempuri.AuthenticationHeader header, org.tempuri.SearchCF0023Info searchCF0023) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getCF0023(header, searchCF0023);
  }
  
  public org.tempuri.GetCF0036Result getCF0036(org.tempuri.AuthenticationHeader header, org.tempuri.SearchCF0036Info searchCF0036) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getCF0036(header, searchCF0036);
  }
  
  public org.tempuri.GetCustomerIDResult getCustomerID(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getCustomerID(header, accountNumber);
  }
  
  public org.tempuri.GetPaymentAmountAdvancedsResult getPaymentAmountAdvanceds(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getPaymentAmountAdvanceds(header, accountNumber);
  }
  
  public org.tempuri.EstimatePaymentAmountAdvancedResult estimatePaymentAmountAdvanced(org.tempuri.AuthenticationHeader header, org.tempuri.EstimatePaymentAmountAdvanced estimatePaymentAdvanced) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.estimatePaymentAmountAdvanced(header, estimatePaymentAdvanced);
  }
  
  public org.tempuri.EstimatePaymentAmountAdvancedResult confirmPaymentAmountAdvanced(org.tempuri.AuthenticationHeader header, org.tempuri.EstimatePaymentAmountAdvanced confirmPaymentAdvanced) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.confirmPaymentAmountAdvanced(header, confirmPaymentAdvanced);
  }
  
  public org.tempuri.CancelOrderResult cancelOrder(org.tempuri.AuthenticationHeader header, org.tempuri.Order order) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.cancelOrder(header, order);
  }
  
  public org.tempuri.OrderCancelsResult cancelOrderList(org.tempuri.AuthenticationHeader header, org.tempuri.CancelOrderIds orderIDs) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.cancelOrderList(header, orderIDs);
  }
  
  public org.tempuri.UpdateOrderResult updateOrder(org.tempuri.AuthenticationHeader header, org.tempuri.Order order) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.updateOrder(header, order);
  }
  
  public org.tempuri.SearchStockOptionRegisterResult searchStockOptionRegister(org.tempuri.AuthenticationHeader header, org.tempuri.SearchStockOptionRegister searchStock) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.searchStockOptionRegister(header, searchStock);
  }
  
  public org.tempuri.AddStockOptionRegisterResult addStockOptionRegister(org.tempuri.AuthenticationHeader header, org.tempuri.AddStockOptionRegister addStock) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.addStockOptionRegister(header, addStock);
  }
  
  public org.tempuri.SearchStockOptionResult searchStockOption(org.tempuri.AuthenticationHeader header, org.tempuri.SearchStockOption searchStock) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.searchStockOption(header, searchStock);
  }
  
  public org.tempuri.GetDepositRatioResult getDepositRatio(org.tempuri.AuthenticationHeader header, org.tempuri.GetDepositRatio getDeposit) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getDepositRatio(header, getDeposit);
  }
  
  public org.tempuri.GetBalancesResult getBalances(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getBalances(header, accountNumber);
  }
  
  public org.tempuri.GetAccountsResult getAccounts(org.tempuri.AuthenticationHeader header, java.lang.String customerId) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getAccounts(header, customerId);
  }
  
  public java.lang.String getAutoAdvance(org.tempuri.AuthenticationHeader header, java.lang.String account) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getAutoAdvance(header, account);
  }
  
  public org.tempuri.GetPositionsResult getPositions(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getPositions(header, accountNumber);
  }
  
  public org.tempuri.GetPositions1Result getPositions1(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getPositions1(header, accountNumber);
  }
  
  public org.tempuri.GetUserProfileResult getUserProfile(org.tempuri.AuthenticationHeader header, java.lang.String customerID, java.lang.String contractNo) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getUserProfile(header, customerID, contractNo);
  }
  
  public org.tempuri.UpdateUserProfileResult updateUserProfile(org.tempuri.AuthenticationHeader header, org.tempuri.UserProfile userProfile) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.updateUserProfile(header, userProfile);
  }
  
  public org.tempuri.GetPPSEResult getPPSE(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber, java.lang.String symbol, double price) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getPPSE(header, accountNumber, symbol, price);
  }
  
  public org.tempuri.GetMarginContractInfoResult getMarginContractInfo(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getMarginContractInfo(header, accountNumber);
  }
  
  public org.tempuri.GetDebtAmountReportResult getDebtAmountReport(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getDebtAmountReport(header, accountNumber);
  }
  
  public java.lang.String getCoreStatus(org.tempuri.AuthenticationHeader header) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getCoreStatus(header);
  }
  
  public org.tempuri.GetSecMarginInfoResult getSecMarginInfo(org.tempuri.AuthenticationHeader header, java.lang.String symbol, java.lang.String productType) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getSecMarginInfo(header, symbol, productType);
  }
  
  public org.tempuri.GetTdTypeListResult getTdTypeList(org.tempuri.AuthenticationHeader header) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getTdTypeList(header);
  }
  
  public org.tempuri.GetTdTypeDetailResult getTdTypeDetail(org.tempuri.AuthenticationHeader header, java.lang.String tdtype) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getTdTypeDetail(header, tdtype);
  }
  
  public org.tempuri.GetWithDrawalTermDepositResult confirmWithDrawalTermDeposit(org.tempuri.AuthenticationHeader header, org.tempuri.WithdrawalTermDepositRequest[] withDrawalTermDepositRequestCollection) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.confirmWithDrawalTermDeposit(header, withDrawalTermDepositRequestCollection);
  }
  
  public org.tempuri.ConfirmTermDepositResult confirmTermDeposit(org.tempuri.AuthenticationHeader header, double amt, java.lang.String tdtype) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.confirmTermDeposit(header, amt, tdtype);
  }
  
  public org.tempuri.CreateTermDepositResult createTermDeposit(org.tempuri.AuthenticationHeader header, double amt, java.lang.String tdtype, java.lang.String acctno) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.createTermDeposit(header, amt, tdtype, acctno);
  }
  
  public org.tempuri.WithDrawalTermDepositResult withDrawalTermDeposit(org.tempuri.AuthenticationHeader header, org.tempuri.WithdrawalTermDepositRequest[] withDrawalTermDepositRequestCollection) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.withDrawalTermDeposit(header, withDrawalTermDepositRequestCollection);
  }
  
  public org.tempuri.ChangeAutoAdvanceResult changeAutoAdvance(org.tempuri.AuthenticationHeader header, java.lang.String account, java.lang.String autoAdvance) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.changeAutoAdvance(header, account, autoAdvance);
  }
  
  public org.tempuri.GetTDTransactionConllectionResult getTDTransactionsStatus(org.tempuri.AuthenticationHeader header, org.tempuri.SearchTransactionTDInfo searchTransactionTDInfo) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getTDTransactionsStatus(header, searchTransactionTDInfo);
  }
  
  public org.tempuri.GetTDTransactionDetailResult getTDTransactionsDetail(org.tempuri.AuthenticationHeader header, org.tempuri.SearchTransactionTDInfo searchTransactionTDInfo) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getTDTransactionsDetail(header, searchTransactionTDInfo);
  }
  
  public org.tempuri.GetTDTransactionDetailResult getTdAvlList(org.tempuri.AuthenticationHeader header, org.tempuri.SearchTransactionTDInfo searchTransactionTDInfo) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getTdAvlList(header, searchTransactionTDInfo);
  }
  
  public org.tempuri.GetTdMastListResult getTdMastList(org.tempuri.AuthenticationHeader header, java.lang.String acctno) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getTdMastList(header, acctno);
  }
  
  public org.tempuri.GetTDEODListResult getTdEOTDList(org.tempuri.AuthenticationHeader header, java.lang.String acctno, double dateAmt) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getTdEOTDList(header, acctno, dateAmt);
  }
  
  public org.tempuri.GetOrderDfReportResult getOrderDfReport(org.tempuri.AuthenticationHeader header, java.lang.String afacctno) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getOrderDfReport(header, afacctno);
  }
  
  public org.tempuri.GetOrderbooksResult searchOrderBooks(org.tempuri.AuthenticationHeader header, org.tempuri.SearchOrderbookInfo searchOrderbookInfo) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.searchOrderBooks(header, searchOrderbookInfo);
  }
  
  public org.tempuri.GetOrderDFAdvancedPaymentAmountResult getOrderDFAdvancedPaymentAmount(org.tempuri.AuthenticationHeader header, java.lang.String afacctno) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getOrderDFAdvancedPaymentAmount(header, afacctno);
  }
  
  public org.tempuri.ConfirmOrderBooksResult confirmOrderBooks(org.tempuri.AuthenticationHeader header, org.tempuri.OrderConfirm[] confirmOrder) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.confirmOrderBooks(header, confirmOrder);
  }
  
  public org.tempuri.ConfirmDFAdvPaymentAmountResult confirmOrderDFAdvancedPaymentAmount(org.tempuri.AuthenticationHeader header, java.lang.String afacctno, org.tempuri.AdvPaymentAmt[] advPaymentAmt) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.confirmOrderDFAdvancedPaymentAmount(header, afacctno, advPaymentAmt);
  }
  
  public org.tempuri.ConfirmDFAdvPaymentAmountResult createOrderDFAdvancedPaymentAmount(org.tempuri.AuthenticationHeader header, java.lang.String afacctno, org.tempuri.AdvPaymentAmt[] advPaymentAmt) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.createOrderDFAdvancedPaymentAmount(header, afacctno, advPaymentAmt);
  }
  
  public org.tempuri.GetMyInfoResult getMyInfo(org.tempuri.AuthenticationHeader header, java.lang.String customerId) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getMyInfo(header, customerId);
  }
  
  public org.tempuri.UpdateMyInfoResult updateMyInfo(org.tempuri.AuthenticationHeader header, org.tempuri.MyInfo myInfo) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.updateMyInfo(header, myInfo);
  }
  
  public org.tempuri.UpdateMyInfoResult updateNotificationEmail(org.tempuri.AuthenticationHeader header, org.tempuri.MyInfo myInfo) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.updateNotificationEmail(header, myInfo);
  }
  
  public org.tempuri.GetAccountPreferencesResult getAccountPreferences(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getAccountPreferences(header, accountNumber);
  }
  
  public org.tempuri.GetAccountFeaturesResult getAccountFeatures(org.tempuri.AuthenticationHeader header, java.lang.String accountNumber) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.getAccountFeatures(header, accountNumber);
  }
  
  public org.tempuri.UpdateAccountFeaturesResult updateAccountFeatures(org.tempuri.AuthenticationHeader header, org.tempuri.AccountFeatures accountFeatures) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.updateAccountFeatures(header, accountFeatures);
  }
  
  public org.tempuri.UpdateAccountPreferencesResult updateAccountPreferences(org.tempuri.AuthenticationHeader header, org.tempuri.AccountPreferences accountPreferences) throws java.rmi.RemoteException{
    if (onlineTradingServiceSoap == null)
      _initOnlineTradingServiceSoapProxy();
    return onlineTradingServiceSoap.updateAccountPreferences(header, accountPreferences);
  }
  
  
}