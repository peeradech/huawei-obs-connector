# Huawei OBS Connector
This module is connector of Object Storage Service (OBS) on Huawei Cloud.

## Description
The Huawei OBS Connector provides an easy to way to use Object Storage Service (OBS) inside your Mendix application.

## Prerequisites 
The following prerequisites are required to use the Object Storage Service (OBS):

### **Huawei Cloud**
To use Object Storage Service (OBS) you must have an account on Huawei Cloud. The Object Storage Service (OBS) is a stable, secure, efficient, and easy-to-use cloud storage service that is scalable and compatible, allowing storage of any amount of unstructured data in any format. 

#### **Console**
OBS Console is a web-based GUI. Through the console, you can perform operations on OBS resources directly.

#### **SDK**
OBS provides software development kits (SDKs) in languages such as Java and provides abundant code examples to facilitate your secondary development.

**SDK Reference**

- [SDK Overview](https://support.huaweicloud.com/intl/en-us/sdkreference-obs/obs_02_0001.html?utm_source=cce_Growth_map&utm_medium=display&utm_campaign=help_center&utm_content=Growth_map)
- [Java SDK Example Programs](https://support.huaweicloud.com/intl/en-us/sdk-java-devg-obs/obs_21_0002.html)

#### **Purchase**
Learn the OBS billing mode and pricing details. You can purchase resources in pay-per-use billing mode, or purchase a resource package as required [Link](https://support.huaweicloud.com/intl/en-us/qs-obs/obs_qs_0000.html?utm_source=cce_Growth_map&utm_medium=display&utm_campaign=help_center&utm_content=Growth_map).

#### **Obtainting Access Keys (AK and SK)**
- [Link](https://support.huaweicloud.com/intl/en-us/qs-obs/obs_qs_0005.html?utm_source=cce_Growth_map&utm_medium=display&utm_campaign=help_center&utm_content=Growth_map)

## Installation and Configuration
1. Download this connector from the mendix Marketplace into your app.
2. Add the `HuaweiConfig_Overview` page to navigation.
3. Go to the configuration and Create a new configuration with your `Access Key/Secret Key` and you can add region by this [reference](https://developer.huaweicloud.com/intl/en-us/endpoint?OBS).

## Dependencies
- 

## Features
- ListBuckets - List of Buckets
- ListPrefixes - List of Prefixes
- ListObjects - List of Objects
- PutObject - Upload file to OBS
- GetObject - Get file from OBS
- DeleteObject - Delete file from OBS

## Know issues
- 