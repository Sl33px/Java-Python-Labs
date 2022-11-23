import zipfile
import re
import os


def search_log_in_file():
    dirname = os.path.dirname(__file__)
    print("open zip")
    zip_log = zipfile.ZipFile(os.path.join(dirname, 'logs.zip'))
    log_file = zip_log.open('logs.txt')
    pattern = r'.*\d+.\d+.\d+.\d+ - - \[(\d+\/\w+\/\d+\:\d+:\d+:\d+) [\d+]+] "([\w]+) [\w\s\/.?=&\-\%:\()]+" (\d+) [\w\s\/.?=&\-\%:\()]+ \"[\w\s\/.?=&\-\%:\();\!\+\,\{}\@\<>\']+" \"[\w\s\/.?=&\-\%:\();\!\+\,\{}\@\<>\']+" \"[\w\s\/.?=&\-\%:\();\!\+\,\{}\@\<>\']+"'
    total_quantity_of_lines = 0

    list_of_first_and_last_lines = []
    list_of_lines = []
    total_list = []

    for line in log_file:
        log = re.search(pattern, str(line))
        if log:
            total_quantity_of_lines += 1

            # insert each line(like string), date, type_of_request, status_of_request in list like turple
            # [(line, date, type, status), (line, date, type, status), (line, date, type, status)...]
            list_of_lines.append({
                "line": str(line),
                "date": log.group(1),
                "type": log.group(2),
                "status": log.group(3)
            })

            # find first line of list
            if log.group(1) == '23/Mar/2009:09:01:04':
                list_of_first_and_last_lines.append(str(line))
                    
            # find last line of list
            if log.group(1) == '28/Mar/2009:02:37:55':
                list_of_first_and_last_lines.append(str(line))
    
    # show quantity of lines in file
    print(f"total quantity of requests is {total_quantity_of_lines}")
    print("-----")
    # iterate list and insert lines in new list with limiters(date)
    for dictionary in range(len(list_of_lines)):
        # print(list_of_lines[dictionary]["status"])
        if list_of_lines[dictionary]["line"] == list_of_first_and_last_lines[0]:
            while list_of_lines[dictionary]["line"] != list_of_first_and_last_lines[-13]:
                
                # print(list_of_lines[dictionary]["status"])

                if list_of_lines[dictionary]["type"] == "GET" and list_of_lines[dictionary]["status"] == "200":
                    # print(list_of_lines[dictionary])
                    total_list.append(list_of_lines[dictionary])
                dictionary += 1
    
    # list of lines during 23/Mar - 28/Mar
    print("Total list:")
    quantity_of_lines = 0
    for dictionary in range(len(total_list)):
        quantity_of_lines += 1
        print("Num of line:", quantity_of_lines)
        print(total_list[dictionary]["line"])
        print("Date:", total_list[dictionary]["date"])
        print("Type of request:", total_list[dictionary]["type"])
        print("Status of request:", total_list[dictionary]["status"])
        print("-------------")
    print(f"Total quantity of requests with type GET and status 200 is {quantity_of_lines}/{total_quantity_of_lines}")

    zip_log.close()

search_log_in_file()