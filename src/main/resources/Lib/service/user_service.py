from org.apache.ibatis.session import SqlSession
from com.yauritux.util import MyBatisUtil
from com.yauritux.domain import User
from com.yauritux.domain import UserService as UserSvc
from com.yauritux.mappers import UserMapper

class UserService(UserSvc):
    
    def __init__(self):
        pass
    
    def getUserById(self, userId):
        session = MyBatisUtil.getSqlSessionFactory().openSession()
        try:
            userMapper = session.getMapper(UserMapper)
            return userMapper.getUserById(userId)
        finally:
            session.close()
            
    def getUserByEmailId(self, emailId):
        session = MyBatisUtil.getSqlSessionFactory().openSession()
        try:
            userMapper = session.getMapper(UserMapper)
            return userMapper.getEmailById(emailId)
        finally:
            session.close()