# 发布示例

## gpg 签名
```shell
# 下载gpg

# 生成 key，输入 passphrase，并保存 passphrase 供后续使用
$ gpg --gen-key

# 列出 key
$ gpg --list-keys
pub   ed25519 2024-04-09 [SC] [expires: 2027-04-09]
      ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890000
uid           [unknown] test <test@test.com>

# 列出 key，需要使用的十六进制格式的签名keyid的最后8个字符，sig 3 对应 settings.xml 的 gpg.keyname
$ gpg --list-signatures --keyid-format 0xshort
pub   ed25519/0x67890000 2024-04-09 [SC] [expires: 2027-04-09]
      ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890000
uid           [ unknown] test <test@test.com>
sig 3        0x67890000 2024-04-09  test <test@test.com>
sub   cv25519/0xEFGH6789 2024-04-09 [E] [expires: 2027-04-09]
sig          0x67890000 2024-04-09  test <test@test.com>

# 上传 key 到公钥服务器，过程中可能需要邮件验证
$ gpg --keyserver keys.openpgp.org --send-keys ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890000
```

## 配置修改
```
# settings.xml
## 增加 server 和 profile 项，注意：
### 1、${gpg.passphrase} 为 gpg --gen-key 生成 key 时的设置的密码
### 2、${gpg.keyname} 为 sig 3 的值，即 0x67890000
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
    <servers>
        <server>
          <id>central</id>
          <username>${username}|${key}</username>
          <password>${password}|${token}</password>
        </server>
    </servers>

    <profiles>
        <profile>
            <id>central</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <gpg.executable>/usr/bin/gpg</gpg.executable>
                <gpg.passphrase>${gpg.passphrase}</gpg.passphrase>
                <gpg.keyname>${gpg.keyname}</gpg.keyname>
            </properties>
        </profile>
    </profiles>
</settings>

# pom.xml
## 根据要求增加项：name, description, url, developers, licenses, scm
## 添加插件：central-publishing-maven-plugin, maven-source-plugin, maven-javadoc-plugin, maven-gpg-plugin
```

## 备注
* [参考官网](https://central.sonatype.org/publish/publish-portal-maven/#using-build-tools-for-signing)
