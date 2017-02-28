from org.apache.ibatis.session import SqlSession
from com.yauritux.util import MyBatisUtil
from com.yauritux.domain import Rule
from com.yauritux.domain import RuleService as RuleSvc
from com.yauritux.mappers import RuleMapper

class RuleService(RuleSvc):
    
    def __init__(self):
        pass
    
    def getRuleById(self, ruleId):
        session = MyBatisUtil.getSqlSessionFactory().openSession()
        try:
            ruleMapper = session.getMapper(RuleMapper)
            return ruleMapper.getUserById(ruleId)
        finally:
            session.close()
            
    def getRuleByName(self, ruleName):
        session = MyBatisUtil.getSqlSessionFactory().openSession()
        try:
            ruleMapper = session.getMapper(RuleMapper)
            return ruleMapper.getRuleByName(ruleName)
        finally:
            session.close()