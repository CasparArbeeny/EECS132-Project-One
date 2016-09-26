# EECS132-Project-One

Things to Do

Trader
The Trader represents an entity that is allowed to trade stocks. The Trader class will need instance fields to keep track of the name of the trader and a current balance for the trader. The class will have the following methods:

getName
Takes no input and returns a String. Returns the name of the trader.
setName
Takes a single String as input and returns nothing. The name of the trader is changed to the input value.
getBalance
Takes no input and returns a double. Returns the current balance of the account.
withdraw
Takes a single double value as input and returns nothing. The balance is decreased by the input amount.
deposit
Takes a single double value as input and returns nothing. The balance is increased by the input amount.
The Trader class will have one constructor:

The constructor takes a single String input that is the account name.
Order
An Order represents the data required to either buy or sell a stock. The Order class should have instance fields to keep track of the stock symbol, the number of shares, the price, the trader placing the order, and an indicator of whether we can partially fill the order. For the purposes of this homework, all stocks will have single character symbols. The Order class will have the following methods:

getStockSymbol
takes no input and returns a char. Returns the single character symbol of the stock that this order is for. (The order's stock symbol does not change.)
getNumberShares
Takes no input and returns an int. Returns the number of shares of the order.
setNumberShares
Takes a single int value as input and returns nothing. The input value is the number of shares of the order.
getPrice
Takes no input and returns a double. Returns the desired price per share of the order.
setPrice
Takes a single double value and returns nothing. The input value is the price per share of the order.
getAllOrNone
Takes no input and returns a boolean. The method returns true if we must trade all the shares of the order. The method returns false if we can trade some, but not all, of the shares of the order.
setAllOrNone
Takes a single boolean as input returns nothing. Sets whether we must trade all the shares of the order (a true value) or whether we can trade some of the shares of the order (a false value).
getTrader
Takes no input and returns a Trader value. The method returns the trader that placed this order. (The trader of the order does not change.)
The Order class has one constructor.

the constructor takes five inputs: a char that is the stock symbol, an int that is the number of shares, a double that is the price, a boolean that is true if we must trade all the shares of the order, and a Trader that is the trader placing the order.
BuyOrder
A BuyOrder instance represents an order to buy stock. The BuyOrder class should extend the Order class. The BuyOrder class has the same features as the Order class.

SellOrder
A SellOrder instance represents an order to sell stock. The SellOrder class should extend the Order class. The SellOrder class has the same features as the Order class.

MarketBuyOrder
A MarketBuyOrder instance represents an order to buy stock that is placed by a market maker. The MarketBuyOrder class should extend the BuyOrder class. The MarketBuyOrder class has the same features as the BuyOrder class except for the following:

The constructor for MarketBuyOrder should set its input types so that the Trader of the order must be a value of type Market.
The getAllOrNone method should never return true.
MarketSellOrder
A MarketSellOrder instance represents an order to sell stock that is placed by a market maker. The MarketSellOrder class should extend the SellOrder class. The MarketSellOrder class has the same features as the SellOrder class except for the following:

The constructor for MarketSellOrder should set its input types so that the Trader of the order must be a value of type Market.
The getAllOrNone method should never return true.
Transaction
A Transaction represents the successful trade of stock. The Transaction class should have instance fields to keep track of the stock symbol, the number of shares, the price, the trader buying the stock, the trader selling the stock, the market handling the transaction, and an indicator of whether the transaction has been closed. Other than the indicator field, the fields of Transaction will not change value. The Transaction class will have the following methods:

getStockSymbol
Takes no input and returns a char. Returns the single character symbol of the stock that this trade transaction is for.
getNumberShares
Takes no input and returns an int. Returns the number of shares of this trade transaction.
getPrice
Takes no input and returns a double. Returns the price per share this of this trade transaction.
getBuyer
Takes no input and returns a Trader value. The method returns the trader that is buying the stock.
getSeller
Takes no input and returns a Trader value. The method returns the trader that is selling the stock.
getMarketMaker
Takes no input and returns a Market value. The method returns the market that is handling the transaction.
isClosed
Takes no input and returns a boolean value.
processTransaction 
Takes no input and returns no value. If the transaction is closed, this method does nothing. Otherwise, the method withdraws the transaction cost (the number of shares times the price) from the buyer and deposits it into the seller. In addition, the market may change a transactionFee and/or a commission on the transaction. The commission is a percent that is multiplied by the transaction cost and the transaction fee is a fixed amount. The buyer and seller will each pay half of the commission and transaction fee amounts, and these funds are withdrawn from the buyer and seller and are deposited to the market. Finally, the transaction is closed.
The Transaction class has one constructor.

the constructor takes six inputs: a char that is the stock symbol, an int that is the number of shares, a double that is the price, a Trader that is the trader selling the stock, a Trader that is the trader buying the stock, and a Market that is the market handling the transaction.
Market
The Market class will be a simplified version of the market for a stock.

In the real world, the market for a single stock is a list of open buy and sell orders with the highest price buy order and the lowest price sell order at the top of the list. If an order's buy price ever matches or exceeds another order's sell price, a trade happens. The trade takes the shares from the seller and gives them to the buyer and every agent involved in the transaction earns a fee or a commission. For the market to function, there must always be available buy and sell orders. So, the market is formed by special traders called market makers. A market maker is required to always have buy and sell orders open for the stock.

In this simplified version, we combine the market and the market maker into a single class. Instead of having a list of open orders, the market will have up to two open buy and sell orders (plus the required market maker buy and sell orders) at any one time.

The Market class will extend the Trader class. The MarketTrader class needs fields to store the following information: the stock symbol for this market, the amount of fees and commissions that are charged anytime there is a trade, the best and second best buy orders for a stock and the best and second best sell orders for a stock, the current market maker buy order and market maker sell orders for a stock. Because a market maker order must always be present when the market is open, there will be functionality below to automatically keep market maker orders available. To do this automatic adjustment of the market maker orders there will need to be fields to indicate how many shares should be in the market maker order and how the price of the order should change if the market maker order is ever sold or purchased.

Besides all the methods that Trader has, the Market class should have the following additional methods:

getStockSymbol
Takes a single input that is a char value and returns nothing. Returns the stock symbol that this market is for. The stock symbol will not change.
getCommission
Takes no input and returns a double value. Returns the market's commission rate.
setCommission
Takes a single input that is a double value and returns nothing. Changes the commission the market charges for any trades the market handles.
getTradeFee
Takes no input and returns a double value. Returns the market's trade fee.
setTradeFee
Takes a single input that is a double value and returns nothing. Changes the market's fee that is charged with each trade handled.
getMarketOrderSize
Takes no input and returns an int value. Returns the number of shares that automaticaly generated market maker orders have.
setMarketOrderSize
Takes a single input that is an int value and returns nothing. Changes the number of shares that any automatically generated market maker orders will have.
getPriceOffset
Takes no input and returns a double value. Returns the market maker's order price offset.
setPriceOffset
Takes a single input that is a double value and returns nothing. Changes the market maker's order price offset.
getBestBuyOrder
Takes no input and returns a BuyOrder. Returns the market's best buy order.
getBestSellOrder
Takes no input and returns a SellOrder. Returns the market's best sell order.
get2ndBestBuyOrder
Takes no input and returns a BuyOrder. Returns the market's second best buy order.
get2ndBestSellOrder
Takes no input and returns a SellOrder. Returns the market's second best sell order.
currentMarketBuyPrice
Takes no input and returns a double. Returns the price of the market's best buy order. If there is no best buy order, it returns the price of the market's market maker buy order.
currentMarketSellPrice
Takes no input and returns a double. Returns the price of the market's best sell order. If there is no best buy order, it returns the price of the market's market maker sell order.
isOpen
Takes no input and returns a boolean. Returns true if both a market maker buy order and a market maker sell order exist (is not null) and the price of the market maker buy order is less than the price of the market maker sell order. Returns false otherwise.
isValidOrder
Takes a single input that is a Order value and returns a boolean. If the order's stock symbol matches the market's stock symbol, the price of the order is greater than or equal to the price of the market's market maker buy order, and the price of the order is less than or equal to the price of the market's market maker sell order, then the method returns true. Otherwise the method returns false.
matchingOrders
Takes a BuyOrder and a SellOrder as input and returns a boolean. The method should return true if the buy order's price is greater than or equal to the sell order's price, and if either order is all or none, the the other order must have a number of shares that is equal to or larger than the all or none order's number of shares.
addOrderToMarket
Takes a single BuyOrder and returns nothing. If the buy order's stock symbol does not match the market's stock symbol, the method makes no changes to the market. Otherwise, the method should compare the price of the order against the best buy order (if it exists). If the best buy order does not exist or if the price of the order is greater than the price of the best buy order, the best buy order is moved to the second best buy order, and this order becomes the best buy order. If the price of the order is less than or equal to the price of the best buy order and either the second best buy order does not exist or the price of the order is greater than the price of the second best buy order, then this order becomes the second best buy order. Otherwise there are no changes to the market.
addOrderToMarket 
Takes a single SellOrder and returns nothing. If the sell order's stock symbol does not match the market's stock symbol, the method makes no changes to the market. Otherwise, the method should compare the price of the order against the best sell order (if it exists). If the best sell order does not exist or if the price of the order is less than the price of the best sell order, the best sell order is moved to the second best sell order, and this order becomes the best sell order. If the price of the order is greater than or equal to the price of the best sell order and either the second best buy order does not exists or this order's price is less than the price of the second best sell order, then this order becomes the second best sell order. Otherwise there are no changes to the market.
placeOrder
Takes a single input that is a BuyOrder and returns a Transaction value. The method should do the following:
If the market is not open or if the buy order is not a valid order (use the isOpen and isValidOrder methods), the method should do nothing but return null.
Next, the method should use the matchingOrders method to compare the buy order agains the market's best sell order, the market's second best sell order, and the market's market maker sell order, in that order. If there is no match between the buy order and any of the three sell order's the method should call addOrderToMarket with the buy order and return null.
Otherwise, the method should create a trade using the buy order and the first sell order for which matchingOrders returned true. Creating a trade involves creating a new Transaction value that stores the data of the trade and then doing book keeping to maintain the market. The Transaction value created is returned by the method.
The new Transaction should have the stock symbol, buyer, seller, and market set according to this market, the buy order and the matching sell order. The price of the Transaction is the price of the sell order, and the number of shares of the Transaction is the lesser of the number of shares of the two orders.

If the matching sell order is a market maker sell order, then the market maker sell order is adjusted with its number of shares set to the market maker order size and the price of the market maker sell order increased by the market maker price offset.

If the matching sell order is the second best sell order, the second best sell order is removed (set to null).

If the matching sell order is the best sell order, the second best sell order is copied to the best sell order, and the second best sell order's value is set to null.

placeOrder
Takes a single input that is a SellOrder and returns a Transaction value. The method should do the following:
If the market is not open or if the sell order is not a valid order (use the isOpen and isValidOrder methods), the method should do nothing but return null.
Next, the method should use the matchingOrders method to compare the sell order agains the market's best buy order, the market's second best buy order, and the market's market maker buy order, in that order. If there is no match between the sell order and any of the three buy order's the method should call addOrderToMarket with the sell order and return null.
Otherwise, the method should create a trade using the sell order and the first buy order for which matchingOrders returned true. Creating a trade involves creating a new Transaction value that stores the data of the trade and then doing book keeping to maintain the market. The Transaction value created is returned by the method.
The new Transaction should have the stock symbol, buyer, seller, and market set according to this market, the sell order and the matching buy order. The price of the Transaction is the price of the buy order, and the number of shares of the Transaction is the lesser of the number of shares of the two orders.

If the matching buy order is a market maker buy order, then the market maker buy order is adjusted with its number of shares set to the market maker order size and the price of the market maker sell order decreased by the market maker price offset.

If the matching buy order is the second best buy order, the second best buy order is removed (set to null).

If the matching buy order is the best buy order, the second best buy order is copied to the best buy order, and the second best buy order's value is set to null.

The Market class has one constructor.

the constructor takes six inputs: a String value representing the name of the market, a char that is the stock symbol for the market, a double that is the trade fee, a double that is the commission, an int that is the market maker order size, and a double that is the market maker price offset.