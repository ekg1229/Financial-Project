import json
import join

file_path='C:\koreainvestment-autotrade-main\portfolioResult.json'

with open(file_path,'rt',encoding='UTF8') as file:
    json_data = json.load(file)#딕셔너리 형태로 저장

stock_name_list=[]
i=0
for stock in json_data['stock']:
    name=list(stock.values())[0]
    stock_name_list[i]=join(name)
    i=i+1

print(stock_name_list)



# stock_name=list(json_data.values())
# print(stock_name)

# for stock in json_data['stock']:
    
#     print(stock['stock_name'])


# for stock in json_data['stock']:
#     stock_name=list(json_data[stock]['stock_name'].values())
#     print(stock_name)







    

# print(stock_name)

# for i, stock in stock_name, json_data['stock']:
#     stock_name[i]=json_data['stock']['stock_name']
#     print(stock_name[i])
